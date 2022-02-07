import java.util.ArrayList;
import java.util.LinkedList;

public class Folder {
    private Folder root = null;
    private ArrayList<Folder> folders = new ArrayList<>();
    private ArrayList<FileClass> files = new ArrayList<>();
    private String name = "New Folder";

    public Folder createFolder(String name){
        var temp = new Folder();
        temp.setName(name);
        folders.add(temp);
        return getFolder(folders.indexOf(temp));

    }
    public Folder getFolder(int index){
        return folders.get(index);
    }
    public Folder getFolderName(String name){
        for (var i : folders){
            if (i.name.equals(name)){
                return i;
            }
        }
        return null;
    }
    public FileClass getFilesName(String name){
        for (var i : files){
            if (i.getName().equals(name)){
                return i;
            }
        }
        return null;
    }
    public void removeFolder(String name){
        var temp = getFolderName(name);
        folders.remove(temp);
    }

    public void createFiles(String name){
        var temp = new FileClass();
        temp.setNameFile(name);
        files.add(temp);

    }
    public Folder getLink(){
        return this;
    }
    public void printDir(){
        for (var i : files){
            if (files.equals(null)){
                break;
            }
            System.out.println(i.getName());
        }
        for (var i : folders){
            if (folders.equals(null)){
                break;
            }
            System.out.println(i.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoot(Folder root) {
        this.root = root;
    }

    public Folder getRoot() {
        return root;
    }
}
