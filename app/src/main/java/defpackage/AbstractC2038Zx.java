package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: Zx */
/* loaded from: classes.dex */
public abstract class AbstractC2038Zx {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public AbstractC2038Zx(Context context, C1857Xo1 c1857Xo1) {
        this.a = c1857Xo1;
        Context applicationContext = context.getApplicationContext();
        O90.e(applicationContext, "context.applicationContext");
        this.b = applicationContext;
        this.c = new Object();
        this.e = new LinkedHashSet();
    }

    public static boolean f(ReadableMap readableMap, String str) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) ? false : true;
    }

    public String a() {
        return null;
    }

    public abstract String b();

    public abstract Object c();

    public abstract String d();

    public abstract String e();

    public void g(ReadableMap readableMap) throws IOException {
        C6045nH c6045nH;
        ArrayList arrayList;
        ReactApplicationContext reactApplicationContext;
        String string;
        this.e = readableMap;
        if (f(readableMap, "isNewTask") && readableMap.getBoolean("isNewTask")) {
            ((Intent) this.b).addFlags(268468224);
        }
        if (f(readableMap, "subject")) {
            ((Intent) this.b).putExtra("android.intent.extra.SUBJECT", readableMap.getString("subject"));
        }
        if (f(readableMap, Scopes.EMAIL)) {
            ((Intent) this.b).putExtra("android.intent.extra.EMAIL", new String[]{readableMap.getString(Scopes.EMAIL)});
        }
        if (f(readableMap, "title")) {
            this.c = readableMap.getString("title");
        }
        String string2 = f(readableMap, "message") ? readableMap.getString("message") : "";
        String string3 = f(readableMap, "social") ? readableMap.getString("social") : "";
        if (string3.equals("sms")) {
            String string4 = readableMap.getString("recipient");
            if (!string4.isEmpty()) {
                ((Intent) this.b).putExtra("address", string4);
            }
        }
        if (string3.equals("whatsapp") && readableMap.hasKey("whatsAppNumber")) {
            ((Intent) this.b).putExtra("jid", AbstractC8235ym.i(readableMap.getString("whatsAppNumber"), "@s.whatsapp.net"));
        }
        if (string3.equals("whatsappbusiness") && readableMap.hasKey("whatsAppNumber")) {
            ((Intent) this.b).putExtra("jid", AbstractC8235ym.i(readableMap.getString("whatsAppNumber"), "@s.whatsapp.net"));
        }
        boolean zF = f(readableMap, "urls");
        ReactApplicationContext reactApplicationContext2 = (ReactApplicationContext) this.a;
        int i = 0;
        if (!zF) {
            if (!f(readableMap, "url")) {
                if (TextUtils.isEmpty(string2)) {
                    return;
                }
                ((Intent) this.b).putExtra("android.intent.extra.TEXT", string2);
                return;
            }
            String string5 = f(readableMap, "filename") ? readableMap.getString("filename") : null;
            Boolean boolValueOf = f(readableMap, "useInternalStorage") ? Boolean.valueOf(readableMap.getBoolean("useInternalStorage")) : Boolean.FALSE;
            U41 u41 = f(readableMap, "type") ? new U41(readableMap.getString("url"), readableMap.getString("type"), string5, boolValueOf, (ReactApplicationContext) this.a) : new U41(readableMap.getString("url"), string5, boolValueOf, reactApplicationContext2);
            this.d = u41;
            if (!(u41.w() || u41.y())) {
                if (TextUtils.isEmpty(string2)) {
                    ((Intent) this.b).putExtra("android.intent.extra.TEXT", readableMap.getString("url"));
                    return;
                }
                Intent intent = (Intent) this.b;
                StringBuilder sbK = NX.k(string2, " ");
                sbK.append(readableMap.getString("url"));
                intent.putExtra("android.intent.extra.TEXT", sbK.toString());
                return;
            }
            Uri uriV = ((U41) this.d).v();
            ClipData clipDataNewUri = ClipData.newUri(reactApplicationContext2.getContentResolver(), "File", uriV);
            Intent intent2 = (Intent) this.b;
            String str = (String) ((U41) this.d).d;
            intent2.setType(str != null ? str : "*/*");
            ((Intent) this.b).setClipData(clipDataNewUri);
            ((Intent) this.b).putExtra("android.intent.extra.STREAM", uriV);
            ((Intent) this.b).addFlags(1);
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            ((Intent) this.b).putExtra("android.intent.extra.TEXT", string2);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        if (f(readableMap, "filenames")) {
            ReadableArray array = readableMap.getArray("filenames");
            for (int i2 = 0; i2 < array.size(); i2++) {
                arrayList2.add(array.getString(i2));
            }
        }
        Boolean boolValueOf2 = Boolean.FALSE;
        if (f(readableMap, "useInternalStorage")) {
            boolValueOf2 = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        if (f(readableMap, "type")) {
            ReadableArray array2 = readableMap.getArray("urls");
            String string6 = readableMap.getString("type");
            c6045nH = new C6045nH(array2, arrayList2, boolValueOf2, reactApplicationContext2);
            c6045nH.b = string6;
        } else {
            c6045nH = new C6045nH(readableMap.getArray("urls"), arrayList2, boolValueOf2, reactApplicationContext2);
        }
        ArrayList arrayList3 = (ArrayList) c6045nH.c;
        Iterator it = arrayList3.iterator();
        boolean z = true;
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            z = c6045nH.f(uri) || c6045nH.g(uri);
            if (!z) {
                break;
            }
        }
        if (!z) {
            if (TextUtils.isEmpty(string2)) {
                ((Intent) this.b).putExtra("android.intent.extra.TEXT", readableMap.getArray("urls").getString(0));
                return;
            }
            Intent intent3 = (Intent) this.b;
            StringBuilder sbK2 = NX.k(string2, " ");
            sbK2.append(readableMap.getArray("urls").getString(0));
            intent3.putExtra("android.intent.extra.TEXT", sbK2.toString());
            return;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
        int i3 = 0;
        while (i3 < arrayList3.size()) {
            Uri uri2 = (Uri) arrayList3.get(i3);
            boolean zF2 = c6045nH.f(uri2);
            ArrayList arrayList5 = (ArrayList) c6045nH.d;
            ReactApplicationContext reactApplicationContext3 = (ReactApplicationContext) c6045nH.a;
            if (zF2) {
                arrayList = arrayList3;
                String extensionFromMimeType = singleton.getExtensionFromMimeType(uri2.getSchemeSpecificPart().substring(i, uri2.getSchemeSpecificPart().indexOf(";")));
                String strSubstring = uri2.getSchemeSpecificPart().substring(uri2.getSchemeSpecificPart().indexOf(";base64,") + 8);
                if (arrayList5.size() >= i3 + 1) {
                    string = (String) arrayList5.get(i3);
                    reactApplicationContext = reactApplicationContext3;
                } else {
                    StringBuilder sb = new StringBuilder();
                    reactApplicationContext = reactApplicationContext3;
                    sb.append(System.currentTimeMillis());
                    sb.append(".");
                    sb.append(extensionFromMimeType);
                    string = sb.toString();
                }
                try {
                    File file = new File(((Boolean) c6045nH.e).booleanValue() ? reactApplicationContext.getCacheDir() : reactApplicationContext.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                    if (!file.exists() && !file.mkdirs()) {
                        throw new IOException("mkdirs failed on " + file.getAbsolutePath());
                    }
                    File file2 = new File(file, string);
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    fileOutputStream.write(Base64.decode(strSubstring, 0));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    arrayList4.add(RI0.a(reactApplicationContext, file2));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                arrayList = arrayList3;
                if (c6045nH.g(uri2) && uri2.getPath() != null) {
                    if (arrayList5.size() >= i3 + 1) {
                        arrayList4.add(RI0.a(reactApplicationContext3, new File(uri2.getPath(), (String) arrayList5.get(i3))));
                    } else {
                        arrayList4.add(RI0.a(reactApplicationContext3, new File(uri2.getPath())));
                    }
                }
            }
            i3++;
            arrayList3 = arrayList;
            i = 0;
        }
        String str2 = (String) c6045nH.b;
        if (str2 == null) {
            str2 = "*/*";
        }
        ClipData clipData = new ClipData(new ClipDescription("Files", new String[]{str2}), new ClipData.Item((Uri) arrayList4.get(0)));
        for (int i4 = 1; i4 < arrayList4.size(); i4++) {
            clipData.addItem(new ClipData.Item((Uri) arrayList4.get(i4)));
        }
        ((Intent) this.b).setClipData(clipData);
        ((Intent) this.b).setAction("android.intent.action.SEND_MULTIPLE");
        Intent intent4 = (Intent) this.b;
        String str3 = (String) c6045nH.b;
        intent4.setType(str3 != null ? str3 : "*/*");
        ((Intent) this.b).putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList4);
        ((Intent) this.b).addFlags(1);
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        ((Intent) this.b).putExtra("android.intent.extra.TEXT", string2);
    }

    public void h(AbstractC0946Lx abstractC0946Lx) {
        O90.f(abstractC0946Lx, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.c) {
            if (((LinkedHashSet) this.e).remove(abstractC0946Lx) && ((LinkedHashSet) this.e).isEmpty()) {
                k();
            }
        }
    }

    public void i(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.d;
            if (obj2 == null || !obj2.equals(obj)) {
                this.d = obj;
                ((ExecutorC3799fa0) ((C1857Xo1) this.a).d).execute(new RunnableC6769r4(AbstractC8069xu.b0((LinkedHashSet) this.e), 28, this));
            }
        }
    }

    public abstract void j();

    public abstract void k();

    public AbstractC2038Zx(ReactApplicationContext reactApplicationContext) {
        this.c = "Share";
        this.a = reactApplicationContext;
        Intent intent = new Intent("android.intent.action.SEND");
        this.b = intent;
        intent.setType("text/plain");
    }
}
