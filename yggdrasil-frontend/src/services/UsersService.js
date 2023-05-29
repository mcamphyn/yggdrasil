import axios from 'axios';

const USERS_API_BASE_URL = 'http://localhost:8800/api/users/users';

class UsersService{

    getUsers(){
        return axios.get(USERS_API_BASE_URL);
    }

}

export default new UsersService();