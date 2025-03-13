import './Heropage.css';
import hand from '../assets/myimages/star.png';
import right_arrow from "../assets/myimages/right-arrow.png";
import hero_img from "../assets/myimages/hero_img1.webp";
import { Link } from 'react-router-dom'

export const Heropage = () => {
    return (
        <div className="hero">

            <div className="hero-left">
                <h2 className="gold-text">New Arrivals</h2>

                <div className="hero-collection">
                    <div className="hero-hand-icon">
                        <p className="gold-text">New</p>
                        <img src={hand} alt="hand icon" />
                    </div>
                    <p className="gold-text">Collections</p>
                    <p className="gold-text">For everyone</p>
                </div>

                <Link to="/products" style={{ textDecoration: 'none'}}> <div className="hero-latest-btn" style={{color:'white'}}>
                    <div className="gold-text">Latest Collection</div>
                    <img src={right_arrow} alt="arrow" />
                </div></Link>
            </div>
            <div className="hero-right">
                <img src={hero_img} alt="Hero Image" />
            </div>
        </div>
    );
};


export default Heropage