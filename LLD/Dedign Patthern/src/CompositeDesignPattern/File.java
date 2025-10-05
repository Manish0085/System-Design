package CompositeDesignPattern;

public class File  implements FileSystemItem{

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }


    @Override
    public void ls(int indent) {
        String indentSpace = " ".repeat(indent);
        System.out.println(indentSpace + name);
    }

    @Override
    public void openAll(int indent) {
        String indentSpace = " ".repeat(indent);
        System.out.println(indentSpace + name);
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public FileSystemItem cd(String name) {
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isFolder() {
        return false;
    }
}
