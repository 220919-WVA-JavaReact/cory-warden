console.log('Hello world!');

const jsContainer = document.getElementById('mountNode');
const reactContainer = document.getElementById('mountNode2');

function Demo(props) {
  return (
    <div className="demo">
      Hello {props.name}
      <input />
      <p>{new Date().toString()}</p>
    </div>
  );
}

// starting point for our react app
const root = ReactDOM.createRoot(reactContainer);
const update = () => {
  jsContainer.innerHTML = `
    <div class="demo">
        Hello JS
        <input/>
        <p>${new Date()}</p>
    </div>
    `;

  //   root.render(
  //     React.createElement(
  //       'div',
  //       { className: 'demo' },
  //       'Hello React ',
  //       React.createElement('input'),
  //       React.createElement('p', null, new Date().toString())
  //     )
  //   );
  root.render(
    //JSX, not HTML
    //     <div className="demo">
    //       Hello React
    //       <input />
    //       <p>{new Date().toString()}</p>
    //     </div>
    <React.Fragment>
      <Demo name={'Cory'} />
      <Demo name={'Steve'} />
      <Demo name={'Mike'} />
      <Demo name={'Dave'} />
    </React.Fragment>
  );
};

setInterval(update, 1000);
