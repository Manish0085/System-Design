package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem{

    private String name;
    private List<FileSystemItem> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void add(FileSystemItem item){
        this.children.add(item);
    }

    @Override
    public void ls(int indent) {
        String indentSpace = " ".repeat(indent);
        for (FileSystemItem item: children){
            if (item instanceof File)
                System.out.println(indentSpace + item.getName());
            else
                System.out.println(indentSpace+ "+ "+item.getName());
        }
    }

    @Override
    public void openAll(int indent) {
        String indentSpace = " ".repeat(indent);
        System.out.println(indentSpace+"+ "+name);
        for (FileSystemItem child: children)
            child.openAll(indent+4);
    }

    @Override
    public int getSize() {
        int total = 0;
        for (FileSystemItem child: children){
            total += child.getSize();
        }
        return total;
    }

    @Override
    public FileSystemItem cd(String target) {
        for (FileSystemItem child: children){
            if (child.isFolder() && child.getName().equals(target)){
                return child;
            }
        }
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isFolder() {
        return true;
    }
}
