package api.payload;

public class Store {

    /**
     * Store Model
     * {
     *   "id": 0,
     *   "petId": 0,
     *   "quantity": 0,
     *   "shipDate": "2024-07-29T17:45:14.129Z",
     *   "status": "placed",
     *   "complete": true
     * }
     */

    public int storeId;
    public int petId;
    public int quantity;
    public String shipDate;
    public String status;
    public boolean complete;

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
