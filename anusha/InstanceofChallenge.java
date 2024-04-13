package anusha;
public class InstanceofChallenge {
    public static int countInstances(Object[] array, Class<?> clazz) {
        int count = 0;
        for (Object obj : array) {
            if (clazz.isInstance(obj)) {
                count++;
            }
        }
        return count;
    }
}
