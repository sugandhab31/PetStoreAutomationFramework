package api.endpoints;

public class Routes {

    public static String BASE_URL = "https://petstore.swagger.io/v2";

    /**
     * User Model -
     * {
     *   "id": 0,
     *   "username": "string",
     *   "firstName": "string",
     *   "lastName": "string",
     *   "email": "string",
     *   "password": "string",
     *   "phone": "string",
     *   "userStatus": 0
     * }
     */

    public static String postCreateUser = BASE_URL+"/user";
    public static String postCreateUserWithArray = BASE_URL+"/user/createWithArray";
    public static String getUserLogout = BASE_URL+"/user/logout";
    public static String getUserLogin = BASE_URL+"/user/login";
    public static String deleteUser = BASE_URL+"/user/{username}";
    public static String updateUser = BASE_URL+"/user/{username}";
    public static String getUser = BASE_URL+"/user/{username}";
    public static String postCreateUserWithList = BASE_URL+"/user/createWithList";

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

    public static String getStoreInventory = BASE_URL+"/store/inventory";
    public static String postStoreOrder = BASE_URL+"/store/order";
    public static String getStoreOrder = BASE_URL+"/store/order/{orderId}";
    public static String deleteStoreOrder = BASE_URL+"/store/order/{orderId}";

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

    public static String postAddPet = BASE_URL+"/pet";
    public static String postPetImage = BASE_URL+"/pet/{petId}/uploadImage";
    public static String updatePetInfo = BASE_URL+"/pet";
    public static String getPetByStatus = BASE_URL+"/pet/findByStatus";
    public static String getPetByID = BASE_URL+"/pet/{petId}";
    public static String updatePetWithFormData = BASE_URL+"/pet/{petId}";
    public static String deletePet = BASE_URL+"/pet/{petId}";
}
