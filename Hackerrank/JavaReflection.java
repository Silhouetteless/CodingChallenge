//not a complete code!

class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
    ......
    ......
    some more methods
    ......
}



public class Solution {

        public static void main(String[] args){
            
            //creating a class object called student that stores Student class
            Class student = Student.class;
            /*
            getDeclaredMethods() includes private methods, but does not include inherited ones.               getMethods() includes inherited methods, but does not include private ones.
            Student does not extend a parent class, so we have to use getDeclaredMethods()
            */
            Method[] methods = student.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method m : methods){
                //getting names from methods
                methodList.add(m.getName());
            }
            
            //sorting and printing names
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }

    }