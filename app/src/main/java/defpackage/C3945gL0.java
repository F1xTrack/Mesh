package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: gL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3945gL0 extends AbstractC7221tR0 {
    public ReadableArray b;
    public final String c;
    public String d;
    public int e;
    public C1859Xp0 f;
    public File g;
    public long a = 0;
    public Boolean h = Boolean.FALSE;

    public C3945gL0(String str) {
        this.c = str;
    }

    public static void h(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] bArr = new byte[10240];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                inputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, i);
        }
    }

    @Override // defpackage.AbstractC7221tR0
    public final long a() {
        if (this.h.booleanValue()) {
            return -1L;
        }
        return this.a;
    }

    @Override // defpackage.AbstractC7221tR0
    public final C1859Xp0 b() {
        return this.f;
    }

    @Override // defpackage.AbstractC7221tR0
    public final void d(InterfaceC0749Jj interfaceC0749Jj) {
        try {
            i(f(), interfaceC0749Jj);
        } catch (Exception e) {
            AL0.a(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    public final File e() {
        String str;
        InputStream inputStream;
        InputStream inputStreamOpenInputStream;
        int length;
        InputStream inputStreamOpenInputStream2;
        String str2 = "ReactNativeBlobUtil-" + this.c;
        File fileCreateTempFile = File.createTempFile("rnfb-form-tmp", "", C7394uL0.b.getCacheDir());
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        ArrayList arrayList = new ArrayList();
        ReactApplicationContext reactApplicationContext = C7394uL0.b;
        long jAvailable = 0;
        int i = 0;
        while (true) {
            str = "ReactNativeBlobUtil-content://";
            if (i >= this.b.size()) {
                break;
            }
            ReadableMap map = this.b.getMap(i);
            C3754fL0 c3754fL0 = new C3754fL0();
            File file = fileCreateTempFile;
            if (map.hasKey("name")) {
                c3754fL0.a = map.getString("name");
            }
            if (map.hasKey("filename")) {
                c3754fL0.b = map.getString("filename");
            }
            if (map.hasKey("type")) {
                c3754fL0.c = map.getString("type");
            } else {
                c3754fL0.c = c3754fL0.b == null ? "text/plain" : "application/octet-stream";
            }
            if (map.hasKey("data")) {
                c3754fL0.d = map.getString("data");
            }
            arrayList.add(c3754fL0);
            String str3 = c3754fL0.d;
            if (str3 == null) {
                AL0.a("ReactNativeBlobUtil multipart request builder has found a field without `data` property, the field `" + c3754fL0.a + "` will be removed implicitly.");
            } else {
                if (c3754fL0.b == null) {
                    length = str3.getBytes().length;
                } else if (str3.startsWith("ReactNativeBlobUtil-file://")) {
                    String strB = AL0.b(str3.substring(27));
                    if (strB == null || !strB.startsWith("bundle-assets://")) {
                        jAvailable += new File(AL0.b(strB)).length();
                    } else {
                        try {
                            length = reactApplicationContext.getAssets().open(strB.replace("bundle-assets://", "")).available();
                        } catch (IOException e) {
                            AL0.a(e.getLocalizedMessage());
                        }
                    }
                } else if (str3.startsWith("ReactNativeBlobUtil-content://")) {
                    String strSubstring = str3.substring(30);
                    try {
                        inputStreamOpenInputStream2 = reactApplicationContext.getContentResolver().openInputStream(Uri.parse(strSubstring));
                    } catch (Exception e2) {
                        e = e2;
                        inputStreamOpenInputStream2 = null;
                    } catch (Throwable th) {
                        th = th;
                        inputStreamOpenInputStream2 = null;
                    }
                    try {
                        try {
                            jAvailable += inputStreamOpenInputStream2.available();
                        } catch (Throwable th2) {
                            th = th2;
                            if (inputStreamOpenInputStream2 != null) {
                                inputStreamOpenInputStream2.close();
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        AL0.a("Failed to estimate form data length from content URI:" + strSubstring + ", " + e.getLocalizedMessage());
                        if (inputStreamOpenInputStream2 != null) {
                            inputStreamOpenInputStream2.close();
                        }
                        i++;
                        fileCreateTempFile = file;
                    }
                    inputStreamOpenInputStream2.close();
                } else {
                    length = Base64.decode(str3, 0).length;
                }
                jAvailable += length;
            }
            i++;
            fileCreateTempFile = file;
        }
        File file2 = fileCreateTempFile;
        this.a = jAvailable;
        ReactApplicationContext reactApplicationContext2 = C7394uL0.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3754fL0 c3754fL02 = (C3754fL0) it.next();
            String str4 = c3754fL02.d;
            String str5 = c3754fL02.a;
            if (str5 != null && str4 != null) {
                String strK = AbstractC8235ym.k("--", str2, "\r\n");
                String str6 = c3754fL02.c;
                String str7 = c3754fL02.b;
                Iterator it2 = it;
                String str8 = str2;
                if (str7 != null) {
                    String str9 = str;
                    fileOutputStream.write(((strK + "Content-Disposition: form-data; name=\"" + str5 + "\"; filename=\"" + str7 + "\"\r\n") + "Content-Type: " + str6 + "\r\n\r\n").getBytes());
                    if (str4.startsWith("ReactNativeBlobUtil-file://")) {
                        String strB2 = AL0.b(str4.substring(27));
                        if (strB2 == null || !strB2.startsWith("bundle-assets://")) {
                            File file3 = new File(AL0.b(strB2));
                            if (file3.exists()) {
                                h(new FileInputStream(file3), fileOutputStream);
                            } else {
                                AL0.a("Failed to create form data from path :" + strB2 + ", file not exists.");
                            }
                        } else {
                            try {
                                h(reactApplicationContext2.getAssets().open(strB2.replace("bundle-assets://", "")), fileOutputStream);
                            } catch (IOException e4) {
                                StringBuilder sbQ = AbstractC8235ym.q("Failed to create form data asset :", strB2, ", ");
                                sbQ.append(e4.getLocalizedMessage());
                                AL0.a(sbQ.toString());
                            }
                        }
                        str = str9;
                    } else {
                        str = str9;
                        if (str4.startsWith(str)) {
                            String strSubstring2 = str4.substring(30);
                            try {
                                inputStreamOpenInputStream = reactApplicationContext2.getContentResolver().openInputStream(Uri.parse(strSubstring2));
                            } catch (Exception e5) {
                                e = e5;
                                inputStreamOpenInputStream = null;
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream = null;
                            }
                            try {
                                try {
                                    h(inputStreamOpenInputStream, fileOutputStream);
                                } catch (Throwable th4) {
                                    th = th4;
                                    inputStream = inputStreamOpenInputStream;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                AL0.a("Failed to create form data from content URI:" + strSubstring2 + ", " + e.getLocalizedMessage());
                                if (inputStreamOpenInputStream != null) {
                                    inputStreamOpenInputStream.close();
                                }
                                fileOutputStream.write("\r\n".getBytes());
                                it = it2;
                                str2 = str8;
                            }
                            inputStreamOpenInputStream.close();
                        } else {
                            fileOutputStream.write(Base64.decode(str4, 0));
                        }
                    }
                } else {
                    fileOutputStream.write(((strK + "Content-Disposition: form-data; name=\"" + str5 + "\"\r\n") + "Content-Type: " + str6 + "\r\n\r\n").getBytes());
                    fileOutputStream.write(c3754fL02.d.getBytes());
                }
                fileOutputStream.write("\r\n".getBytes());
                it = it2;
                str2 = str8;
            }
        }
        fileOutputStream.write(("--" + str2 + "--\r\n").getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();
        return file2;
    }

    public final InputStream f() {
        try {
            if (this.b != null) {
                return new FileInputStream(this.g);
            }
            int iX = AbstractC8235ym.x(this.e);
            if (iX == 1) {
                return g();
            }
            if (iX == 2) {
                return new ByteArrayInputStream(this.d.getBytes());
            }
            if (iX != 4) {
                return null;
            }
            AL0.a("ReactNativeBlobUtil could not create input stream for request type others");
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            AL0.a("ReactNativeBlobUtil failed to create input stream for request:" + e.getLocalizedMessage());
            return null;
        }
    }

    public final InputStream g() throws Exception {
        if (!this.d.startsWith("ReactNativeBlobUtil-file://")) {
            if (this.d.startsWith("ReactNativeBlobUtil-content://")) {
                String strSubstring = this.d.substring(30);
                try {
                    return C7394uL0.b.getContentResolver().openInputStream(Uri.parse(strSubstring));
                } catch (Exception e) {
                    throw new Exception(AbstractC8235ym.v("error when getting request stream for content URI: ", strSubstring), e);
                }
            }
            try {
                return new ByteArrayInputStream(Base64.decode(this.d, 0));
            } catch (Exception e2) {
                throw new Exception("error when getting request stream: " + e2.getLocalizedMessage());
            }
        }
        String strB = AL0.b(this.d.substring(27));
        if (strB != null && strB.startsWith("bundle-assets://")) {
            try {
                return C7394uL0.b.getAssets().open(strB.replace("bundle-assets://", ""));
            } catch (Exception e3) {
                throw new Exception("error when getting request stream from asset : " + e3.getLocalizedMessage());
            }
        }
        File file = new File(AL0.b(strB));
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            return new FileInputStream(file);
        } catch (Exception e4) {
            throw new Exception("error when getting request stream: " + e4.getLocalizedMessage());
        }
    }

    public final void i(InputStream inputStream, InterfaceC0749Jj interfaceC0749Jj) throws IOException {
        byte[] bArr = new byte[10240];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr, 0, 10240);
            if (i <= 0) {
                inputStream.close();
                return;
            }
            interfaceC0749Jj.O(bArr, 0, i);
            j += i;
            HashMap map = RunnableC8155yL0.z;
            String str = this.c;
            C7585vL0 c7585vL0 = !map.containsKey(str) ? null : (C7585vL0) map.get(str);
            if (c7585vL0 != null) {
                long j2 = this.a;
                if (j2 != 0 && c7585vL0.a(j / j2)) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putString("taskId", str);
                    writableMapCreateMap.putString("written", String.valueOf(j));
                    writableMapCreateMap.putString("total", String.valueOf(this.a));
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) C7394uL0.b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress-upload", writableMapCreateMap);
                }
            }
        }
    }

    public final void j(String str) {
        this.d = str;
        if (str == null) {
            this.d = "";
            this.e = 3;
        }
        try {
            int iX = AbstractC8235ym.x(this.e);
            if (iX == 1) {
                this.a = g().available();
            } else {
                if (iX != 2) {
                    return;
                }
                this.a = this.d.getBytes().length;
            }
        } catch (Exception e) {
            e.printStackTrace();
            AL0.a("ReactNativeBlobUtil failed to create single content request body :" + e.getLocalizedMessage() + "\r\n");
        }
    }
}
