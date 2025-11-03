const oracledb = require("oracledb");

async function run() {
  let connection = await oracledb.getConnection({
    user: "[Username]",
    password: "[Password]",
    connectString: "localhost:1521/FREEPDB1", // [hostname]:[port]/[DB service name]
  });
  let result = await connection.execute("SELECT 'Hello World!' FROM dual");
  console.log(result.rows[0]);
}

run();
