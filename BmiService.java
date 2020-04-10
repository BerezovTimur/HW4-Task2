public class BmiService {
    public float calculate (float weight, float height){
        float index = weight / ((height / 100) * (height / 100));
        return index;
    }
}
