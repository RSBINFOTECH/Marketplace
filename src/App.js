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
    <h2>Technical Architect</h2>
    <div class="fakeimg"  id="style1">
    My goal is to apply my technical skills in Java design and implementation, 
    
     systems configuration and troubleshooting operations to fulfill the company’
     score goals. I aim to bring success to the company by designing, 
     integrating, and updating frameworks to sustain Java applications and providing solutions to address technical issues possibly encountered in a Java environment. My years of experience broadened my knowledge on Java technologies and enhanced my abilities in spotting trends, flaws, and developing upgrades concerning these as well. With my expertise and commitment to become a productive team player,
    I am confident that I can be an asset to the company.
      
        </div>
   
    <h3>More Text</h3>
    <p>Lorem ipsum dolor sit ame.</p>
    <div class="fakeimg"  id="style">  <img src="./images/logo.png" width="100" alt="logo" /></div><br/>
    <div class="fakeimg" id="style">Image</div><br/>
    <div class="fakeimg"  id="style">Image</div>
    </div>
</div>
  <div class="main">
<h2>TITLE HEADING</h2>
<h5>Title description, Dec 7, 2017</h5>
<div class="fakeimg"  id="style">Image</div>
    <p>Some text..</p>
    <p>Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>
    <br></br>
    <h2>TITLE HEADING</h2>
    <h5>Title description, Sep 2, 2017</h5>
    <div class="fakeimg" id="style">Image</div>
    <p>Some text..</p>
    <p>Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>

  </div>

<div class="footer">
  <h2>Footer</h2>
</div>

</div>
    );
  }
}

export default Homepage;
