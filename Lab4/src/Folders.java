import java.util.Arrays;
import java.util.LinkedList;

public class Folders {
    private Folder folder = new Folder();
    private LinkedList<Folder> list = new LinkedList(Arrays.asList(folder));

    public void addFold(String name){
        list.add(folder.createFolder(name));

    }
    public void addFile(String name){
        folder.createFiles(name);
    }
    public void getDir(){
        folder.printDir();
    }
    public void goIntoFolder(String name){
        var temp = folder.getFolderName(name);
        temp.setRoot(folder);
        folder = temp;
    }
    public void goBack(){
        var temp = folder.getRoot();
        folder = temp;
    }
    public void fileOpen(String name){
        folder.getFilesName(name).openFile();
    }
    public void removeFolder(String name){
        removeFolder(name);

    }
    public void printAllFolders(){
        for (var i:list){
            System.out.println(i.getName());
        }
    }


}
