import { Component } from "react";
import UserPolicyCard from "./UserPolicyCard";


class UserPoliciesList extends Component {
  constructor() {
    super();
    this.state = { user_policies: [] };
  }

  Style = {
    
  }
  componentDidMount() {
    var id = localStorage.getItem("token");
    var myRequest = new Request(`http://localhost:8081/Anton/policiesByUserid/1111`);
    // var myRequest = new Request("https://jsonplaceholder.typicode.com/users");
    let user_policies = [];

    fetch(myRequest)
      .then((response) => response.json())
      .then((data) => {
        this.setState({ user_policies: data });
      });
  }

  render() {
    return (
      <div className="responsive-grid">
        <h1>My Policies</h1>
        <ul>
          {this.state.user_policies.map((policy) => {
               console.log(policy);
            return <UserPolicyCard policy={policy} refPolicyTypes={policy.policySubTypes.refPolicyTypes}/>;
          })}
        </ul>
      </div>
    );
  }
}

export default UserPoliciesList;