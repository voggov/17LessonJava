public class Main {
    public static void main(String[] args) {
        Folders folders = new Folders();
        folders.addFold("first");
        folders.getDir();
        System.out.println("//////////////////////////////////////////////////////");
        folders.goIntoFolder("first");
        folders.addFold("Jopa");
        folders.addFile("Pizda");
        folders.fileOpen("Pizda.file");
        folders.getDir();
        System.out.println("//////////////////////////////////////////////////////");
        folders.goBack();
        folders.getDir();


    }
}
