public class TestGenerics<T> {  // as the class type
    T anInstance;
    T [] anArrayOfTs;
    // as an instance variable type
    // as an array type
       TestGenerics(T anInstance) {
          this.anInstance = anInstance;
    }
    T getT() {
          return anInstance;
       }
}