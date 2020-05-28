import React, { Component } from "react";
import logo from "./logo.svg";
import "./App.css";

class Homepage extends Component {
  render() {
    return (
        <div>

<div class="navbar" >
  <a href="#" class="active">Home</a>
  <a href="#">Github</a>
  <a href="#">Blog</a>
  <a href="#" class="right">springBoot</a>
  <a href="#" class="right">Core Java</a>
</div>

<div class="row">
<div class="side">
  <span>
  <img src="./images/leaf.png" width="100" height="100" alt="leaf-main-image" />
  </span>
    <h2>Woring At Nokia AS Technical Architect</h2>
    <div class="fakeimg"  id="style1">
    My goal is to apply my technical skills in Java design and implementation, 
     systems configuration and troubleshooting operations to fulfill the company’
     score goals. I aim to bring success to the company by designing, 
     integrating, and updating frameworks to sustain Java applications and providing solutions to address technical issues possibly encountered in a Java environment. My years of experience broadened my knowledge on Java technologies and enhanced my abilities in spotting trends, flaws, and developing upgrades concerning these as well. With my expertise and commitment to become a productive team player,
    I am confident that I can be an asset to the company.
      
        </div>
  
    <div class="fakeimg"> 
   Architected solutions to health care business problems involving interactive voice response and subscriber oriented health incentive programs.
   Advised development team on design options in line with Aetna enterprise infrastructure and project life cycle.
   Engaged as an integrated part of project team and championed project from inception to design/development.
   Work with business to translate business needs into functional requirements and generated preliminary solutions in conjunction with business/infrastructure/development representatives.
   Drove high level/detailed designs on architecturally significant components based on Aetna internal standards and presented and articulated proposed solutions to architecture review group.
   Put together architectural artifacts to form a repository representing point-of-time and finalized architectural conceptual design.
   Worked with multiple parties to resolve time/budget constraints and resource contention issues.
   Communicated with infrastructure/fellow architects/enterprise framework group to ensure best practices and address scalability/reusability issues. </div><br/>
   <div class="container">
  <iframe class="responsive-iframe" src="https://www.youtube.com/embed/tgbNymZ7vqY"></iframe>
  <iframe class="responsive-iframe" src="https://www.youtube.com/embed/tgbNymZ7vqY"></iframe>
  <iframe class="responsive-iframe" src="https://www.youtube.com/embed/tgbNymZ7vqY"></iframe>
  <iframe class="responsive-iframe" src="https://www.youtube.com/embed/tgbNymZ7vqY"></iframe>
  <iframe class="responsive-iframe" src="https://www.youtube.com/embed/tgbNymZ7vqY"></iframe>

</div>
    </div>
    <div>
    <span class="label success">Success</span>
   <span class="label info">Info</span>
  <span class="label warning">Warning</span>
  <span class="label danger">Danger</span>
   <span class="label other">Other</span>


    </div>
</div>
 

<div class="footer">
  <h2>Footer
  </h2>
  <spa>@CopyRight RSB Infotech pvt ltd </spa>
  <li><span>
    <a href="portfolio.html" target="_blank">See my portfolio</a>
</span></li>
</div>

</div>
    );
  }
}

export default Homepage;
