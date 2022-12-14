import React from 'react';
import PolicyCarousel from '../auth/PolicyCarousel';
import Dictionary  from './Dictionary';
import Modal from './Modal';
import { policyArray } from '../../utils/dummy';
import { policyArrayImgLink } from '../../utils/dummy';
import PolicyCard from "../auth/PolicyCard";
import Carousel from "react-multi-carousel";
import "react-multi-carousel/lib/styles.css";

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


export const Explore = () => {
    return (
        <div>
            <br></br><br></br><br></br>
            <div style={{align:"center", margin:"auto" }}>
                <Modal />
            </div>
            <Dictionary />
            <br></br><br></br>
                {/* <Carousel
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
          {policyArray.map((policy) => (
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
      </Carousel> */}

      <PolicyCarousel />
            </div>
       
    )
}
