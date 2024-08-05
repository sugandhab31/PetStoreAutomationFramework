package api.payload;

public class Pet {

    /**
     * Pet Model
     * {
     *   "id": 0,
     *   "category": {
     *     "id": 0,
     *     "name": "string"
     *   },
     *   "name": "doggie",
     *   "photoUrls": [
     *     "string"
     *   ],
     *   "tags": [
     *     {
     *       "id": 0,
     *       "name": "string"
     *     }
     *   ],
     *   "status": "available"
     * }
     */
    public int id;
    public petCategory category;
    public String name;
    public String[] photoUrls;
    public petTags[] tags;
    public String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public petCategory getCategory() {
        return category;
    }

    public void setCategory(petCategory category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(String[] photoUrls) {
        this.photoUrls = photoUrls;
    }

    public petTags[] getTags() {
        return tags;
    }

    public void setTags(petTags[] tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
