document.addEventListener("DOMContentLoaded", function() {
    document.getElementById("formulario").addEventListener("submit", function(event) {
        event.preventDefault(); // Evita el envío del formulario
        convertir(); // Llama a tu función
    });
});

function convertir() {
	
	let cantidad = document.getElementById("cantidad").value;
	let selectorLibra = document.getElementById("libras");
	let selectorPeseta =  document.getElementById("pesetas");
	let divisa;
	let respuestaContainer = document.getElementById("respuesta");
	
	if (selectorLibra.checked){
		divisa = "libras"
	} else if (selectorPeseta.checked){
		divisa = "pesetas"
	}
	
	console.log (divisa);
	
	
	
	const url = 'ConvertirNumeroIntroducido?cantidad=' + cantidad + '&divisa=' + divisa;

	fetch(url)
		.then(respuesta => {
			return respuesta.text()
		})
		.then (resultado => {
			respuestaContainer.innerHTML = resultado;
		}
		
		);
}



