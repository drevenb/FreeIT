package annotation;

@Version(version = "v.15.2.5")
public class MyService {
    private String name;
    private int version;

    private void thisClassInfo() {
        System.out.println("Name: " + name);
        System.out.println("Version: " + version);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyService myService = (MyService) o;

        if (version != myService.version) return false;
        return name != null ? name.equals(myService.name) : myService.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + version;
        return result;
    }
}
