package com.example.andro.usb_and_server;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {
    Button s;
    ServerSocket serverSocket;
EditText email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s = findViewById(R.id.button);
        email =findViewById(R.id.email);
        password=findViewById(R.id.password);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vi o = new vi();
                o.start();
                Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private class vi extends Thread {
        @Override
        public void run() {
            Socket n;
            try {
                serverSocket = new ServerSocket(8080);
                while (true) {
                    n = serverSocket.accept();
                    vr y = new vr(n);
                    y.start();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private class vr extends Thread {
        Socket b;
        BufferedReader reader;
        PrintWriter writer;
        String w,so;
        vr(Socket g) {
            b = g;
        }

        @Override
        public void run() {
            String s = "<html>\n" +
                    "    <head>\n" +
                    "        <meta charset=\"UTF-8\">\n" +
                    "        <title>Te-Date</title>\n" +
                    "<style>\n" +
                    ".a\n" +
                    "{\n" +
                    " font-size: 20px;\n" +
                    "  background : green;\n" +
                    "    height: auto;\n" +
                    "   width: 100%;\n" +
                    "    border: 3px solid #73AD21;\n" +
                    "}\n" +
                    ".s\n" +
                    "{\n" +
                    "\n" +
                    " font-size: 20px;\n" +
                    "  background : rgb(128,140,140);\n" +
                    "    height: 100%;\n" +
                    "   width: 200px;\n" +
                    "    border: 3px solid rgb(128,110,110);\n" +
                    "}\n" +
                    ".h\n" +
                    "{  \n" +
                    "    width:196px;\n" +
                    "    background-color: #4CAF60;\n" +
                    "    border: none;\n" +
                    "    color: white;\n" +
                    "    padding: 16px 32px;\n" +
                    "    text-decoration: none;\n" +
                    "    margin: 4px 2px;\n" +
                    "    cursor: pointer;\n" +
                    "}\n" +
                    ".q\n" +
                    "{  \n" +
                    "    width:50%;\n" +
                    "    background-color: #4CAF60;\n" +
                    "    border: none;\n" +
                    "    color: white;\n" +
                    "    padding: 16px 32px;\n" +
                    "    text-decoration: none;\n" +
                    "    margin: 4px 2px;\n" +
                    "    cursor: pointer;\n" +
                    "}\n" +
                    ".q3\n" +
                    "{  \n" +
                    "    width:96%;\n" +
                    "    background-color: black;\n" +
                    "    border: 1;\n" +
                    "    color: white;\n" +
                    "    padding: 16px 32px;\n" +
                    "    text-decoration: none;\n" +
                    "    margin: 4px 2px;\n" +
                    "    cursor: pointer;\n" +
                    "}\n" +
                    ".tx\n" +
                    "{  \n" +
                    "    width:90%;\n" +
                    "    background-color: #4CAF60;\n" +
                    "    border: none;\n" +
                    "    color: white;\n" +
                    "    padding: 16px 32px;\n" +
                    "    text-decoration: none;\n" +
                    "    margin: 4px 2px;\n" +
                    "}\n" +
                    ".d\n" +
                    "{  \n" +
                    "    width:196px;\n" +
                    "    background-color: black;\n" +
                    "    border: none;\n" +
                    "    color: white;\n" +
                    "    padding: 16px 32px;\n" +
                    "    text-decoration: none;\n" +
                    "    margin: 4px 2px;\n" +
                    "    cursor: pointer;\n" +
                    "}\n" +
                    ".k div{\n" +
                    "float:left;\n" +
                    "}\n" +
                    ".ce{ width:84.54%;height: 100%;}" +
                    "</style>" +
                    "    </head>\n" +
                    "    <body>\n" +
                    "<form action=\"h.html\" method=\"post(a)\">\n" +
                    "        <div class=\"a\" name=\"dev2\">\n" +
                    "<center>\n" +
                    "        <h1 name=\"q\">Te-Date</h1>\n" +
                    "</center>\n" +
                    "        </div>\n" +
                    "        <div class=\"k\" name=\"a\">\n" +
                    "<div class=\"s\" name=\"a\">\n" +
                    "    <div name=\"a\">\n" +
                    "        <input class=\"h\" name=\"a\" type=\"button\" value=\"Home\" >\n" +
                    "</div>\n" +
                    "    <div>\n" +
                    "        <input class=\"d\" name=\"a\" type=\"button\" value=\"Get Start\" >\n" +
                    "</div>\n" +
                    "<div>\n" +
                    "<input class=\"h\" name=\"a\" type=\"button\" value=\"Why ssp?\" >\n" +
                    "</div>\n" +
                    "<div name=\"a\">\n" +
                    "<input class=\"h\" type=\"button\" name=\"a\" value=\"About ssp\">\n" +
                    "</div>\n" +
                    "<div name=\"a\">\n" +
                    "<input class=\"h\" name=\"a\" type=\"button\" value=\"Founder\" >\n" +
                    "</div>\n" +
                    "<div name=\"a\">\n" +
                    "<input class=\"h\" name=\"a\" type=\"button\" value=\"Connect us\" >\n" +
                    "</div>\n" +
                    "</div>\n" +
                    "    <div class=\"ce\" name=\"div1\">\n" +
                    "        <br>\n" +
                    "        <br>\n" +
                    "        <br>\n" +
                    "         <center>\n" +
                    "              <table border=\"1\" name=\"a\" style=\"width:50%\" >\n" +
                    "  <tr>\n" +
                    "<td> \n" +
                    "<br>\n" +
                    "  <center>\n" +
                    "      <table name=\"mytable\" style=\"width:100%;height: 100% \">\n" +
                    "          \n" +
                    "          <tr>\n" +
                    "              <td><center><p name=\"text1\">E-mail :</p></center></td>\n" +
                    "              <td>\n" +
                    "                  <input class=\"tx\" type=\"email\" name=\"x\"  placeholder=\"enter email\" value=\"\" >\n" +
                    "              </td>\n" +
                    "             </tr>\n" +
                    "             <tr>\n" +
                    "                 <td><center><p name=\"text2\">password :</p></center> </td>\n" +
                    "                 <td>\n" +
                    "                     <input class=\"tx\" name=\"z\" type=\"password\" placeholder=\"enter password\" value=\"\" >\n" +
                    "                     </td>\n" +
                    "                 </tr>\n" +
                    "      </table> \n" +
                    "        <br>\n" +
                    "  </center>\n" +
                    "  <center><input class=\"q3\" type=\"submit\" name=\"f\" value=\"Sing in\"  >\n" +
                    "</center>\n" +
                    "              </td>\n" +
                    "              </tr>     \n" +
                    "        </table> \n" +
                    "         </center>\n" +
                    "    </div>\n" +
                    "        </div>\n" +
                    "</form>" +
                    " </body>\n" +
                    "</html>\n";
            String g = "<html>\n" +
                    "    <head>\n" +
                    "        <meta charset=\"UTF-8\">\n" +
                    "        <title>Team work</title>\n" +
                    "    </head>\n" +
                    "    <body>\n" +
                    "<style>\n" +
                    ".a\n" +
                    "{\n" +
                    " font-size: 80%;\n" +
                    "  background : green;\n" +
                    "    height: auto;\n" +
                    "   width: 100%;\n" +
                    "    border: 3px solid #73AD21;\n" +
                    "}\n" +
                    ".s\n" +
                    "{\n" +
                    " font-size: 5%;\n" +
                    "  background : rgb(128,140,140);\n" +
                    "    height: 100%;\n" +
                    "   width: 100%;\n" +
                    "    border: 3px solid rgb(128,110,110);\n" +
                    "}\n" +
                    ".h\n" +
                    "{ \n" +
                    "    width:15%;\n" +
                    "    background-color: #4CAF50;\n" +
                    "    border: none;\n" +
                    "    color: white;\n" +
                    "    padding: 16px 32px;\n" +
                    "    text-decoration: none;\n" +
                    "    margin: 4px 2px;\n" +
                    "    cursor: pointer;\n" +
                    "}\n" +
                    "</style>\n" +
                    "        <div class=\"a\">\n" +
                    "<center>\n" +
                    "        <h1>University</h1>\n" +
                    "        </div>\n" +
                    "<div class=\"s\" name=\"a\">\n" +
                    "<center>\n" +
                    "<input class=\"h\" type=\"button\" value=\"University\" >\n" +
                    "<input class=\"h\" type=\"button\" value=\"University city\" >\n" +
                    "<input class=\"h\" type=\"button\" value=\"University resturant\" >\n" +
                    "<input class=\"h\" type=\"button\" value=\"Student\" >\n" +
                    "<input class=\"h\" type=\"button\" value=\"Play\" >\n" +
                    "<br>\n" +
                    " <iframe width=\"88%\" height=\"80%\"\n" +
                    "src=\"https://www.youtube.com/embed/hFmpom-p_xM\">\n" +
                    "</iframe> \n" +
                    "<br>\n" +
                    "</center>\n" +
                    "</div>\n" +
                    "</body>\n" +
                    "</html>\n";
            try {
                b.setKeepAlive(true);
                reader = new BufferedReader(new InputStreamReader(b.getInputStream()));
                w = reader.readLine();

                writer = new PrintWriter(b.getOutputStream());
                writer.print("HTTP/1.0 200" + "\r\n");
                writer.print("Content type: text/php" + "\r\n");
                writer.print("Content length: " + g.length() + "\r\n");
                writer.print("\r\n");
                so="GET /h.html?x="+email.getText().toString().replace("@","%40")+"&z="+password.getText().toString()+"&f=Sing+in HTTP/1.1";
                if (w.length() >= so.length() && w.substring(0, so.length()).equals(so)) {
                    writer.print(g + "\r\n");
                } else {
                    writer.print(s + "\r\n");
                }
                writer.flush();
                b.close();
                MainActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
            }
        }
    }
}
