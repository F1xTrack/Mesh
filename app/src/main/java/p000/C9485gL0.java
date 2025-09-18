package p000;

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
public final class C9485gL0 extends AbstractC11161tR0 {

    /* renamed from: b */
    public ReadableArray f27686b;

    /* renamed from: c */
    public final String f27687c;

    /* renamed from: d */
    public String f27688d;

    /* renamed from: e */
    public int f27689e;

    /* renamed from: f */
    public C8540Xp0 f27690f;

    /* renamed from: g */
    public File f27691g;

    /* renamed from: a */
    public long f27685a = 0;

    /* renamed from: h */
    public Boolean f27692h = Boolean.FALSE;

    public C9485gL0(String str) {
        this.f27687c = str;
    }

    /* renamed from: h */
    public static void m18434h(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
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

    @Override // p000.AbstractC11161tR0
    /* renamed from: a */
    public final long mo9186a() {
        if (this.f27692h.booleanValue()) {
            return -1L;
        }
        return this.f27685a;
    }

    @Override // p000.AbstractC11161tR0
    /* renamed from: b */
    public final C8540Xp0 mo9187b() {
        return this.f27690f;
    }

    @Override // p000.AbstractC11161tR0
    /* renamed from: d */
    public final void mo9188d(InterfaceC0613Jj interfaceC0613Jj) {
        try {
            m18438i(m18436f(), interfaceC0613Jj);
        } catch (Exception e) {
            AL0.m156a(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public final File m18435e() {
        String str;
        InputStream inputStream;
        InputStream inputStreamOpenInputStream;
        int length;
        InputStream inputStreamOpenInputStream2;
        String str2 = "ReactNativeBlobUtil-" + this.f27687c;
        File fileCreateTempFile = File.createTempFile("rnfb-form-tmp", "", C11277uL0.f43672b.getCacheDir());
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        ArrayList arrayList = new ArrayList();
        ReactApplicationContext reactApplicationContext = C11277uL0.f43672b;
        long jAvailable = 0;
        int i = 0;
        while (true) {
            str = "ReactNativeBlobUtil-content://";
            if (i >= this.f27686b.size()) {
                break;
            }
            ReadableMap map = this.f27686b.getMap(i);
            C9357fL0 c9357fL0 = new C9357fL0();
            File file = fileCreateTempFile;
            if (map.hasKey("name")) {
                c9357fL0.f27141a = map.getString("name");
            }
            if (map.hasKey("filename")) {
                c9357fL0.f27142b = map.getString("filename");
            }
            if (map.hasKey("type")) {
                c9357fL0.f27143c = map.getString("type");
            } else {
                c9357fL0.f27143c = c9357fL0.f27142b == null ? "text/plain" : "application/octet-stream";
            }
            if (map.hasKey("data")) {
                c9357fL0.f27144d = map.getString("data");
            }
            arrayList.add(c9357fL0);
            String str3 = c9357fL0.f27144d;
            if (str3 == null) {
                AL0.m156a("ReactNativeBlobUtil multipart request builder has found a field without `data` property, the field `" + c9357fL0.f27141a + "` will be removed implicitly.");
            } else {
                if (c9357fL0.f27142b == null) {
                    length = str3.getBytes().length;
                } else if (str3.startsWith("ReactNativeBlobUtil-file://")) {
                    String strM157b = AL0.m157b(str3.substring(27));
                    if (strM157b == null || !strM157b.startsWith("bundle-assets://")) {
                        jAvailable += new File(AL0.m157b(strM157b)).length();
                    } else {
                        try {
                            length = reactApplicationContext.getAssets().open(strM157b.replace("bundle-assets://", "")).available();
                        } catch (IOException e) {
                            AL0.m156a(e.getLocalizedMessage());
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
                        AL0.m156a("Failed to estimate form data length from content URI:" + strSubstring + ", " + e.getLocalizedMessage());
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
        this.f27685a = jAvailable;
        ReactApplicationContext reactApplicationContext2 = C11277uL0.f43672b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C9357fL0 c9357fL02 = (C9357fL0) it.next();
            String str4 = c9357fL02.f27144d;
            String str5 = c9357fL02.f27141a;
            if (str5 != null && str4 != null) {
                String strM26234k = AbstractC7222ym.m26234k("--", str2, "\r\n");
                String str6 = c9357fL02.f27143c;
                String str7 = c9357fL02.f27142b;
                Iterator it2 = it;
                String str8 = str2;
                if (str7 != null) {
                    String str9 = str;
                    fileOutputStream.write(((strM26234k + "Content-Disposition: form-data; name=\"" + str5 + "\"; filename=\"" + str7 + "\"\r\n") + "Content-Type: " + str6 + "\r\n\r\n").getBytes());
                    if (str4.startsWith("ReactNativeBlobUtil-file://")) {
                        String strM157b2 = AL0.m157b(str4.substring(27));
                        if (strM157b2 == null || !strM157b2.startsWith("bundle-assets://")) {
                            File file3 = new File(AL0.m157b(strM157b2));
                            if (file3.exists()) {
                                m18434h(new FileInputStream(file3), fileOutputStream);
                            } else {
                                AL0.m156a("Failed to create form data from path :" + strM157b2 + ", file not exists.");
                            }
                        } else {
                            try {
                                m18434h(reactApplicationContext2.getAssets().open(strM157b2.replace("bundle-assets://", "")), fileOutputStream);
                            } catch (IOException e4) {
                                StringBuilder sbM26240q = AbstractC7222ym.m26240q("Failed to create form data asset :", strM157b2, ", ");
                                sbM26240q.append(e4.getLocalizedMessage());
                                AL0.m156a(sbM26240q.toString());
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
                                    m18434h(inputStreamOpenInputStream, fileOutputStream);
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
                                AL0.m156a("Failed to create form data from content URI:" + strSubstring2 + ", " + e.getLocalizedMessage());
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
                    fileOutputStream.write(((strM26234k + "Content-Disposition: form-data; name=\"" + str5 + "\"\r\n") + "Content-Type: " + str6 + "\r\n\r\n").getBytes());
                    fileOutputStream.write(c9357fL02.f27144d.getBytes());
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

    /* renamed from: f */
    public final InputStream m18436f() {
        try {
            if (this.f27686b != null) {
                return new FileInputStream(this.f27691g);
            }
            int iM26247x = AbstractC7222ym.m26247x(this.f27689e);
            if (iM26247x == 1) {
                return m18437g();
            }
            if (iM26247x == 2) {
                return new ByteArrayInputStream(this.f27688d.getBytes());
            }
            if (iM26247x != 4) {
                return null;
            }
            AL0.m156a("ReactNativeBlobUtil could not create input stream for request type others");
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            AL0.m156a("ReactNativeBlobUtil failed to create input stream for request:" + e.getLocalizedMessage());
            return null;
        }
    }

    /* renamed from: g */
    public final InputStream m18437g() throws Exception {
        if (!this.f27688d.startsWith("ReactNativeBlobUtil-file://")) {
            if (this.f27688d.startsWith("ReactNativeBlobUtil-content://")) {
                String strSubstring = this.f27688d.substring(30);
                try {
                    return C11277uL0.f43672b.getContentResolver().openInputStream(Uri.parse(strSubstring));
                } catch (Exception e) {
                    throw new Exception(AbstractC7222ym.m26245v("error when getting request stream for content URI: ", strSubstring), e);
                }
            }
            try {
                return new ByteArrayInputStream(Base64.decode(this.f27688d, 0));
            } catch (Exception e2) {
                throw new Exception("error when getting request stream: " + e2.getLocalizedMessage());
            }
        }
        String strM157b = AL0.m157b(this.f27688d.substring(27));
        if (strM157b != null && strM157b.startsWith("bundle-assets://")) {
            try {
                return C11277uL0.f43672b.getAssets().open(strM157b.replace("bundle-assets://", ""));
            } catch (Exception e3) {
                throw new Exception("error when getting request stream from asset : " + e3.getLocalizedMessage());
            }
        }
        File file = new File(AL0.m157b(strM157b));
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            return new FileInputStream(file);
        } catch (Exception e4) {
            throw new Exception("error when getting request stream: " + e4.getLocalizedMessage());
        }
    }

    /* renamed from: i */
    public final void m18438i(InputStream inputStream, InterfaceC0613Jj interfaceC0613Jj) throws IOException {
        byte[] bArr = new byte[10240];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr, 0, 10240);
            if (i <= 0) {
                inputStream.close();
                return;
            }
            interfaceC0613Jj.mo4392O(bArr, 0, i);
            j += i;
            HashMap map = RunnableC11786yL0.f46197z;
            String str = this.f27687c;
            C11405vL0 c11405vL0 = !map.containsKey(str) ? null : (C11405vL0) map.get(str);
            if (c11405vL0 != null) {
                long j2 = this.f27685a;
                if (j2 != 0 && c11405vL0.m25401a(j / j2)) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putString("taskId", str);
                    writableMapCreateMap.putString("written", String.valueOf(j));
                    writableMapCreateMap.putString("total", String.valueOf(this.f27685a));
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) C11277uL0.f43672b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress-upload", writableMapCreateMap);
                }
            }
        }
    }

    /* renamed from: j */
    public final void m18439j(String str) {
        this.f27688d = str;
        if (str == null) {
            this.f27688d = "";
            this.f27689e = 3;
        }
        try {
            int iM26247x = AbstractC7222ym.m26247x(this.f27689e);
            if (iM26247x == 1) {
                this.f27685a = m18437g().available();
            } else {
                if (iM26247x != 2) {
                    return;
                }
                this.f27685a = this.f27688d.getBytes().length;
            }
        } catch (Exception e) {
            e.printStackTrace();
            AL0.m156a("ReactNativeBlobUtil failed to create single content request body :" + e.getLocalizedMessage() + "\r\n");
        }
    }
}
