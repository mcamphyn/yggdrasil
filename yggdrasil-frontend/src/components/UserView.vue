<template>
  <div class="container">
    <div class="row">
      <div class="col-sm">
        <h1> Employees List</h1>
        <table class="table table-striped">
          <thead>
            <tr>
              <td>ID</td>
              <td>Username</td>
              <td>Email</td>
              <td>Secret</td>
            </tr>
          </thead>
          <tbody>
            <tr v-for="user in users" v-bind:key="user.id">
              <td> {{user.id }}</td>
              <td> {{user.username }}</td>
              <td> {{user.email}}</td>
              <td> {{user.secret}}</td>
              <td> <button> View</button></td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
    <div class="row">
    </div>
  </div>
  <div class="container">
    <form>
      <div class="form-group row">
        <label for="Username" class="col-sm-2 col-form-label">Username</label>
        <div class="col-sm-10">
          <input type="text" readonly class="form-control-plaintext" id="staticEmail" value="email@example.com">
        </div>
      </div>
      <div class="form-group row">
        <label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
        <div class="col-sm-10">
          <input type="password" class="form-control" id="inputPassword" placeholder="Password">
        </div>
      </div>
    </form>
  </div>


  <div class="modal fade" id="modal_demo" tabindex="-1" aria-labelledby="modal_demo_label" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="modal_demo_label">Modal title</h5>
          <button type="button" class="btn-close" aria-label="Close" @click="closeModal"></button>
        </div>
        <div class="modal-body">
          ...
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" @click="closeModal">Close</button>
          <button type="button" class="btn btn-primary">Save changes</button>
        </div>
      </div>
    </div>
  </div>

</template>

<script>

import UsersService from '../services/UsersService';

export default {
  name: 'UserView',
  data(){
    return {
      users: [{username:"test",email:"test@test.gt",secret:"HFSDG54245T5FG",id:34}]
    }
  },
  methods: {
    getUsers(){
      UsersService.getUsers().then((response) => {
        this.users = response.data;
      });
    }
  },

  created() {
    this.getUsers();
  }
}

</script>