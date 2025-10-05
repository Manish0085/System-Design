package CompositeDesignPattern;

public class Test
{
    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.add(new File("file1.txt", 1));
        root.add(new File("file2.txt", 1));
        root.add(new File("file3.txt", 1));

        Folder doc = new Folder("docs");
        doc.add(new File("doc1.txt", 1));
        doc.add(new File("doc2.txt", 1));
        root.add(doc);

        Folder image = new Folder("images");
        image.add(new File("photo.jpg", 1));
        root.add(image);

//        root.ls(0);

//        doc.ls(0);
//        root.openAll(0);

        FileSystemItem cwd = root.cd("docs");
        if (cwd != null)
            cwd.ls(0);
        else
            System.out.println("\nCould not cd into doc\n");

    }
}
