import criteria.*;
import model.Entry;
import model.File;
import model.Folder;
import service.FileSearchService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileSystem {
    public static void main(String[] args) {

        List<Entry> rootChildren = new ArrayList<Entry>();
        Entry f1 = new File("abc.txt", 2, "aifjsjoif", "txt");
        Entry f2 = new File("bcd.txt", 5, "aifjsjoif", "txt");
        Entry f3 = new File("def.png", 15, "aifjsjoif", "png");
        Entry f4 = new File("gef.jpeg", 20, "aifjsjoif", "jpeg");

        rootChildren.addAll(Arrays.asList(f1, f2, f3, f4));

        Entry root = new Folder("home", rootChildren);


//        Entry anotherFolder = new
//        ((Folder)root).add


        FileSearchService fileSearchService = new FileSearchService(rootChildren);

        // abc size == 10
        NameSearchCriteria nameSearchCriteria = new NameSearchCriteria("abc.txt");
        SizeEqualsToCriteria sizeEqualsToCriteria = new SizeEqualsToCriteria(10);

        Specification search = nameSearchCriteria.and(sizeEqualsToCriteria);

        System.out.println(fileSearchService.search(search));

        // abc size < 10 abx.txt
        nameSearchCriteria = new NameSearchCriteria("abc.txt");
        SizeLessThanSearchCriteria sizeLessThanSearchCriteria = new SizeLessThanSearchCriteria(10);

        search = nameSearchCriteria.and(sizeLessThanSearchCriteria);

        System.out.println(fileSearchService.search(search));

        // size < 10 txt
        ExtentionSearchCriteria extentionSearchCriteria = new ExtentionSearchCriteria("txt");
        sizeLessThanSearchCriteria = new SizeLessThanSearchCriteria(10);

        search = extentionSearchCriteria.and(sizeLessThanSearchCriteria);

        System.out.println(fileSearchService.search(search));

        // png or jpeg
        ExtentionSearchCriteria pngExt = new ExtentionSearchCriteria("png");
        ExtentionSearchCriteria jpegExt = new ExtentionSearchCriteria("jpeg");
//        SizeGreaterThanSearchCriteria sizeGreaterThanSearchCriteria = new SizeGreaterThanSearchCriteria(16);

        search = pngExt.or(jpegExt);
//        search.and(sizeGreaterThanSearchCriteria);

        System.out.println(fileSearchService.search(search));
    }
}
