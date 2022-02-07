public class FileClass {
    private String nameFile;

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public void openFile() {
        System.out.println("\t\t" + "File is open");
    }

    public String getName() {
        return nameFile + ".file";
    }

}
