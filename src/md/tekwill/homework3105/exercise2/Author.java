package md.tekwill.homework3105.exercise2;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name) {
        this.name = name;
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author name : " + name + ", gender:  " + gender + " email:  " + email;
    }

    @Override
    public boolean equals(Object obj) {
       // if (this == obj) return true;
       // if (!(obj instanceof Author)) {
        //    return false;
        //}
       // Author author = (Author) obj;
        /*if(obj instanceof Author)
        return getName().equals(((Author)obj).getName());
        else
            return false;*/
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Author author=(Author) obj;
        return getName().equals(author.getName());
    }

}