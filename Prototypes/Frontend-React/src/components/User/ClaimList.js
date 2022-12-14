import { Component } from "react";
import { ClaimCard } from "./ClaimCard";
import "../../index.css";
class ClaimList extends Component {
  constructor() {
    super();
    this.state = { user_claims: [] };
  }

  Style = {
    
  }
  componentDidMount() {
    var myRequest = new Request("http://localhost:8081/Anton/claimsByUserid/1111");
    // var myRequest = new Request("https://jsonplaceholder.typicode.com/users");
    let user_claims = [];

    fetch(myRequest)
      .then((response) => response.json())
      .then((data) => {
        this.setState({ user_claims: data });
      });
  }

  render() {
    return (
      <div className="responsive-grid">
        <h1>My Claims</h1>
        <ul>
          {this.state.user_claims.map((claim) => {
               console.log(claim);
             return <ClaimCard claims={claim} policies={claim.userPolicies} claimStatusCode={claim.claimStatusCodes}/>;
          })}
        </ul>
      </div>
    );
  }
}
export default ClaimList;