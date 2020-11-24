class MyForm extends React.Component {

  constructor(props) {
    super(props);
    this.state = { value: '', text: '', magnitude: '' };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    this.setState({ text: event.target.value });
  }

  handleSubmit(event) {

    this.setState({ loading: "true" });

    fetch('/nlp/sentiment?text=' + this.state.text)
    .then(res => res.json())
    .then(r => {
      this.setState({
        result: JSON.stringify(r),
        magnitude: parseFloat(r.magnitude)
      });
      this.setState({ loading: "false" });
      ReactDOM.render(React.createElement("div", null, "Result: " , this.state.result), document.getElementById('result'));
      //event.preventDefault();
    });

 
  }

  render() {
    return (
      React.createElement("form", null,
      React.createElement("label", null, "Insert text bellow",

      React.createElement("br", null),
      React.createElement("textarea", { rows: "3", cols: "50", onChange: this.handleChange },
      this.state.text)),

      React.createElement("br", null),

      React.createElement("br", null),
      
      React.createElement("input", { type: "button", value: "Analyse", id: "myBtn", placeholder: "Analyse Sentiment", onClick: this.handleSubmit })));
  }}

  

//now render your form
ReactDOM.render(React.createElement(MyForm, null), document.getElementById('myApp'));