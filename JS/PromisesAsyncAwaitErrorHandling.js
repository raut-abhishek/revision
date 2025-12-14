

function fetchData(success) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      success ? resolve("Data loaded") : reject("Error!");
    }, 1000);
  });
}

// Using async/await
async function getData() {
  try {
    const result = await fetchData(true);
    console.log(result);
  } catch (err) {
    console.error(err);
  }
}

getData();
