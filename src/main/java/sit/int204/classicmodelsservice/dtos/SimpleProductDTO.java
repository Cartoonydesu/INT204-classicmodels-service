package sit.int204.classicmodelsservice.dtos;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import sit.int204.classicmodelsservice.entities.Productline;
//import lombok.Value;

@Getter
@Setter
public class SimpleProductDTO {
    private String id;
    private String productName;
    @JsonIgnore
    private Productline productline;
    private Double
            msrp;

    private  String FILE_URI;

    public String getProductLine() {
        return productline.getId();
    }
    public String getImageUrl() {
        return id + ".jpg";
    }
}
