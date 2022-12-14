import React, { Component, useEffect } from 'react';
import PolicyCard from "./PolicyCard";
import Carousel from "react-multi-carousel";
import "react-multi-carousel/lib/styles.css";
import { policyArray, policyArrayImgLink } from '../../utils/dummy';


const responsive = {
    desktop: {
        breakpoint: { max: 3000, min: 1024 },
        items: 3,
        slidesToSlide: 3, // optional, default to 1.
    },
    tablet: {
        breakpoint: { max: 1024, min: 464 },
        items: 2,
        slidesToSlide: 2, // optional, default to 1.
    },
    mobile: {
        breakpoint: { max: 464, min: 0 },
        items: 1,
        slidesToSlide: 1, // optional, default to 1.
    },
};


class PolicyCarousel extends Component {


    constructor() {
        super();
        this.state = { res: [], prefStr: "" };
    }

    componentDidMount() {
        
        var prefStr = localStorage.getItem("prefStr");
        var myRequest = new Request(`http://localhost:8081/Anton/fetchAllPolicies`);
        

        fetch(myRequest).then(response => response.json()).
        then((data) => { this.setState({res: data});});
        console.log(this.state.res);

        // policyArray = this.state.res;
    }


    render() {
        return (
            <div>
               <Carousel
        swipeable={false}
        draggable={false}
        showDots={true}
        responsive={responsive}
        ssr={true} // means to render carousel on server-side.
        infinite={true}
        autoPlay={ true}
        autoPlaySpeed={1000}
        keyBoardControl={true}
        customTransition="all .5"
        transitionDuration={500}
        containerClass="carousel-container"
        removeArrowOnDeviceType={["tablet", "mobile"]}
        deviceType={true}
        dotListClass="custom-dot-list-style"
        itemClass="carousel-item-padding-40-px"
      >
          {this.state.res.map((policy) => (
            <div>
              <PolicyCard
                title={policy.description}
                category={"GET ₹ " + policy.maturityamount + " IN " + policy.maturityperiod + " YEARS"}
                imglink={policyArrayImgLink[Math.floor(Math.random() * policyArrayImgLink.length)].imglink}
                shortdesc={"*T&C APPLY " + " | MEDICAL " + policy.medicalcondn + " | VECHILE " + policy.vehiclecondn + " | AGE " + policy.agecondn}
                longdesc={JSON.stringify(policy.insuranceCompanies)}
              />
            </div>
          ))}
      </Carousel>
            </div>
        )
    }
}

export default PolicyCarousel;