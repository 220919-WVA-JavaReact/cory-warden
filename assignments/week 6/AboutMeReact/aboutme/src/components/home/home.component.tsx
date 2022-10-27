import './home.component.css';

const Home = () => {
    return (
        <div className="body-container">
        <div className="modules">
            <h4>Introduction</h4>
            <hr></hr>
            <p>My name is Cory Warden! I'm 27 years old and have a strong passion for coding. I am a lover of anything Pittsburgh, or anything food. I've spent the 
                last 4 years working as a mechanical specialist/engineer resource for a manufacturing company and am looking to make the transition into the tech field.
            </p>
        </div>
        <div className="modules">
            <h4>Where I'm From</h4>
            <hr></hr>
            <p>I am currently in Winston-Salem, NC. I have previously lived multiple placed, as I traveled for work, but the last three would be:
                <ul>
                    <li>St Pete Beach, FL</li>
                    <li>Fort Worth, TX</li>
                    <li>Weirton, WV</li>
                </ul>
            </p>
        </div>
        <div className="modules">
            <h4>Hobbies</h4>
            <hr></hr>
            <p>
                Working night shift doesn't give ample opportunity for social interaction, but I did my best! Below are some of my favorite hobbies:
                <ul>
                    <li>Video Games</li>
                    <li>Anime</li>
                    <li>Breweries</li>
                    <li>My new lil pup</li>
                </ul>
            </p>
        </div>
        <div className="modules">
            <h4>Favorite Foods</h4>
            <hr></hr>
            <p>
                Despite being the fantastic lean cuisine/lunachables chef that I am, I also eat other things on occasion:
                <ol>
                    <li>Pizza</li>
                    <li>Birria</li>
                    <li>Anything italian</li>
                    <li>Sushi</li>
                    <li>Hot Chicken of any sort</li>
                </ol>
            </p>
        </div>
    </div>
    );
}

export default Home;