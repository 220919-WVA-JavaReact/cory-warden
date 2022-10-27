import Socials from '../socials/socials';
import './contact.component.css';

const profiles = [
    {
    hrefname: "https://www.linkedin.com/in/iamcorywarden/",
    itemname: 'LinkedOut'
    },
    {
    hrefname: "https://github.com/12cwarden",
    itemname: 'Github'
    },
    {
    hrefname: "https://www.youtube.com/watch?v=dQw4w9WgXcQ",
    itemname: 'Myspace'
    }
]

const Contact = () => {
    return(
        <div className="body-container">
        <div>
            <img src="https://i.gyazo.com/1c863bf93e7df665f1f9a73293ac51cd.png" alt="self"></img>
        </div>
        <div className="social">
            <h4>Find me below!</h4>
            <hr></hr>
            {
            profiles.map( profile => (
                <Socials hrefname={profile.hrefname} itemname={profile.itemname} />
            ))}
        </div>
    </div>
    )
}

export default Contact