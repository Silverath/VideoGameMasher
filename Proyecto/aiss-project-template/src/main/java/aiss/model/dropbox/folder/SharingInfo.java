
package aiss.model.dropbox.folder;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
=======
<<<<<<< HEAD
=======
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
>>>>>>> master
>>>>>>> Figueroa
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "read_only",
    "parent_shared_folder_id",
    "traverse_only",
    "no_access"
})
<<<<<<< HEAD
@JsonIgnoreProperties(ignoreUnknown=true)

=======
<<<<<<< HEAD
=======
@JsonIgnoreProperties(ignoreUnknown=true)

>>>>>>> master
>>>>>>> Figueroa
public class SharingInfo {

    @JsonProperty("read_only")
    private Boolean readOnly;
    @JsonProperty("parent_shared_folder_id")
    private String parentSharedFolderId;
    @JsonProperty("traverse_only")
    private Boolean traverseOnly;
    @JsonProperty("no_access")
    private Boolean noAccess;

    @JsonProperty("read_only")
    public Boolean getReadOnly() {
        return readOnly;
    }

    @JsonProperty("parent_shared_folder_id")
    public String getParentSharedFolderId() {
        return parentSharedFolderId;
    }

    @JsonProperty("traverse_only")
    public Boolean getTraverseOnly() {
        return traverseOnly;
    }

    @JsonProperty("no_access")
    public Boolean getNoAccess() {
        return noAccess;
    }

}
