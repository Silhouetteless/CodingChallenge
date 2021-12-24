import java.io.File;

class NewDirectory {

  public static void main(String[] args) {

    //creating a new directory inside Tests(parent directory)
    //remember about the escape character for \
    File file = new File(/*path*/"Tests\\directory");

    //when the parent directory already exists use mkdir()
    boolean value = file.mkdir();
    //or use file.mkdirs(); if you want to create the parent directory as well


    if(value) {
      System.out.println("The new directory is created.");
    }
    else {
      System.out.println("The directory already exists.");
    }
  }

}