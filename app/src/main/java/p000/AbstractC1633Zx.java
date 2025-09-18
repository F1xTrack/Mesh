package p000;

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
public abstract class AbstractC1633Zx {

    /* renamed from: a */
    public final Object f15235a;

    /* renamed from: b */
    public Object f15236b;

    /* renamed from: c */
    public Object f15237c;

    /* renamed from: d */
    public Object f15238d;

    /* renamed from: e */
    public Object f15239e;

    public AbstractC1633Zx(Context context, C8539Xo1 c8539Xo1) {
        this.f15235a = c8539Xo1;
        Context applicationContext = context.getApplicationContext();
        O90.m5967e(applicationContext, "context.applicationContext");
        this.f15236b = applicationContext;
        this.f15237c = new Object();
        this.f15239e = new LinkedHashSet();
    }

    /* renamed from: f */
    public static boolean m9647f(ReadableMap readableMap, String str) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) ? false : true;
    }

    /* renamed from: a */
    public String mo8964a() {
        return null;
    }

    /* renamed from: b */
    public abstract String mo8965b();

    /* renamed from: c */
    public abstract Object mo9099c();

    /* renamed from: d */
    public abstract String mo8966d();

    /* renamed from: e */
    public abstract String mo8967e();

    /* renamed from: g */
    public void mo4103g(ReadableMap readableMap) throws IOException {
        C6479nH c6479nH;
        ArrayList arrayList;
        ReactApplicationContext reactApplicationContext;
        String string;
        this.f15239e = readableMap;
        if (m9647f(readableMap, "isNewTask") && readableMap.getBoolean("isNewTask")) {
            ((Intent) this.f15236b).addFlags(268468224);
        }
        if (m9647f(readableMap, "subject")) {
            ((Intent) this.f15236b).putExtra("android.intent.extra.SUBJECT", readableMap.getString("subject"));
        }
        if (m9647f(readableMap, Scopes.EMAIL)) {
            ((Intent) this.f15236b).putExtra("android.intent.extra.EMAIL", new String[]{readableMap.getString(Scopes.EMAIL)});
        }
        if (m9647f(readableMap, "title")) {
            this.f15237c = readableMap.getString("title");
        }
        String string2 = m9647f(readableMap, "message") ? readableMap.getString("message") : "";
        String string3 = m9647f(readableMap, "social") ? readableMap.getString("social") : "";
        if (string3.equals("sms")) {
            String string4 = readableMap.getString("recipient");
            if (!string4.isEmpty()) {
                ((Intent) this.f15236b).putExtra("address", string4);
            }
        }
        if (string3.equals("whatsapp") && readableMap.hasKey("whatsAppNumber")) {
            ((Intent) this.f15236b).putExtra("jid", AbstractC7222ym.m26232i(readableMap.getString("whatsAppNumber"), "@s.whatsapp.net"));
        }
        if (string3.equals("whatsappbusiness") && readableMap.hasKey("whatsAppNumber")) {
            ((Intent) this.f15236b).putExtra("jid", AbstractC7222ym.m26232i(readableMap.getString("whatsAppNumber"), "@s.whatsapp.net"));
        }
        boolean zM9647f = m9647f(readableMap, "urls");
        ReactApplicationContext reactApplicationContext2 = (ReactApplicationContext) this.f15235a;
        int i = 0;
        if (!zM9647f) {
            if (!m9647f(readableMap, "url")) {
                if (TextUtils.isEmpty(string2)) {
                    return;
                }
                ((Intent) this.f15236b).putExtra("android.intent.extra.TEXT", string2);
                return;
            }
            String string5 = m9647f(readableMap, "filename") ? readableMap.getString("filename") : null;
            Boolean boolValueOf = m9647f(readableMap, "useInternalStorage") ? Boolean.valueOf(readableMap.getBoolean("useInternalStorage")) : Boolean.FALSE;
            U41 u41 = m9647f(readableMap, "type") ? new U41(readableMap.getString("url"), readableMap.getString("type"), string5, boolValueOf, (ReactApplicationContext) this.f15235a) : new U41(readableMap.getString("url"), string5, boolValueOf, reactApplicationContext2);
            this.f15238d = u41;
            if (!(u41.m7888w() || u41.m7890y())) {
                if (TextUtils.isEmpty(string2)) {
                    ((Intent) this.f15236b).putExtra("android.intent.extra.TEXT", readableMap.getString("url"));
                    return;
                }
                Intent intent = (Intent) this.f15236b;
                StringBuilder sbM5762k = AbstractC0852NX.m5762k(string2, " ");
                sbM5762k.append(readableMap.getString("url"));
                intent.putExtra("android.intent.extra.TEXT", sbM5762k.toString());
                return;
            }
            Uri uriM7887v = ((U41) this.f15238d).m7887v();
            ClipData clipDataNewUri = ClipData.newUri(reactApplicationContext2.getContentResolver(), "File", uriM7887v);
            Intent intent2 = (Intent) this.f15236b;
            String str = (String) ((U41) this.f15238d).f11647d;
            intent2.setType(str != null ? str : "*/*");
            ((Intent) this.f15236b).setClipData(clipDataNewUri);
            ((Intent) this.f15236b).putExtra("android.intent.extra.STREAM", uriM7887v);
            ((Intent) this.f15236b).addFlags(1);
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            ((Intent) this.f15236b).putExtra("android.intent.extra.TEXT", string2);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        if (m9647f(readableMap, "filenames")) {
            ReadableArray array = readableMap.getArray("filenames");
            for (int i2 = 0; i2 < array.size(); i2++) {
                arrayList2.add(array.getString(i2));
            }
        }
        Boolean boolValueOf2 = Boolean.FALSE;
        if (m9647f(readableMap, "useInternalStorage")) {
            boolValueOf2 = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        if (m9647f(readableMap, "type")) {
            ReadableArray array2 = readableMap.getArray("urls");
            String string6 = readableMap.getString("type");
            c6479nH = new C6479nH(array2, arrayList2, boolValueOf2, reactApplicationContext2);
            c6479nH.f38228b = string6;
        } else {
            c6479nH = new C6479nH(readableMap.getArray("urls"), arrayList2, boolValueOf2, reactApplicationContext2);
        }
        ArrayList arrayList3 = (ArrayList) c6479nH.f38229c;
        Iterator it = arrayList3.iterator();
        boolean z = true;
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            z = c6479nH.m23119f(uri) || c6479nH.m23120g(uri);
            if (!z) {
                break;
            }
        }
        if (!z) {
            if (TextUtils.isEmpty(string2)) {
                ((Intent) this.f15236b).putExtra("android.intent.extra.TEXT", readableMap.getArray("urls").getString(0));
                return;
            }
            Intent intent3 = (Intent) this.f15236b;
            StringBuilder sbM5762k2 = AbstractC0852NX.m5762k(string2, " ");
            sbM5762k2.append(readableMap.getArray("urls").getString(0));
            intent3.putExtra("android.intent.extra.TEXT", sbM5762k2.toString());
            return;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
        int i3 = 0;
        while (i3 < arrayList3.size()) {
            Uri uri2 = (Uri) arrayList3.get(i3);
            boolean zM23119f = c6479nH.m23119f(uri2);
            ArrayList arrayList5 = (ArrayList) c6479nH.f38230d;
            ReactApplicationContext reactApplicationContext3 = (ReactApplicationContext) c6479nH.f38227a;
            if (zM23119f) {
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
                    File file = new File(((Boolean) c6479nH.f38231e).booleanValue() ? reactApplicationContext.getCacheDir() : reactApplicationContext.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                    if (!file.exists() && !file.mkdirs()) {
                        throw new IOException("mkdirs failed on " + file.getAbsolutePath());
                    }
                    File file2 = new File(file, string);
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    fileOutputStream.write(Base64.decode(strSubstring, 0));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    arrayList4.add(RI0.m6934a(reactApplicationContext, file2));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                arrayList = arrayList3;
                if (c6479nH.m23120g(uri2) && uri2.getPath() != null) {
                    if (arrayList5.size() >= i3 + 1) {
                        arrayList4.add(RI0.m6934a(reactApplicationContext3, new File(uri2.getPath(), (String) arrayList5.get(i3))));
                    } else {
                        arrayList4.add(RI0.m6934a(reactApplicationContext3, new File(uri2.getPath())));
                    }
                }
            }
            i3++;
            arrayList3 = arrayList;
            i = 0;
        }
        String str2 = (String) c6479nH.f38228b;
        if (str2 == null) {
            str2 = "*/*";
        }
        ClipData clipData = new ClipData(new ClipDescription("Files", new String[]{str2}), new ClipData.Item((Uri) arrayList4.get(0)));
        for (int i4 = 1; i4 < arrayList4.size(); i4++) {
            clipData.addItem(new ClipData.Item((Uri) arrayList4.get(i4)));
        }
        ((Intent) this.f15236b).setClipData(clipData);
        ((Intent) this.f15236b).setAction("android.intent.action.SEND_MULTIPLE");
        Intent intent4 = (Intent) this.f15236b;
        String str3 = (String) c6479nH.f38228b;
        intent4.setType(str3 != null ? str3 : "*/*");
        ((Intent) this.f15236b).putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList4);
        ((Intent) this.f15236b).addFlags(1);
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        ((Intent) this.f15236b).putExtra("android.intent.extra.TEXT", string2);
    }

    /* renamed from: h */
    public void m9648h(AbstractC0752Lx abstractC0752Lx) {
        O90.m5968f(abstractC0752Lx, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.f15237c) {
            if (((LinkedHashSet) this.f15239e).remove(abstractC0752Lx) && ((LinkedHashSet) this.f15239e).isEmpty()) {
                mo9651k();
            }
        }
    }

    /* renamed from: i */
    public void m9649i(Object obj) {
        synchronized (this.f15237c) {
            Object obj2 = this.f15238d;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f15238d = obj;
                ((ExecutorC9387fa0) ((C8539Xo1) this.f15235a).f13983d).execute(new RunnableC6720r4(AbstractC7167xu.m25982b0((LinkedHashSet) this.f15239e), 28, this));
            }
        }
    }

    /* renamed from: j */
    public abstract void mo9650j();

    /* renamed from: k */
    public abstract void mo9651k();

    public AbstractC1633Zx(ReactApplicationContext reactApplicationContext) {
        this.f15237c = "Share";
        this.f15235a = reactApplicationContext;
        Intent intent = new Intent("android.intent.action.SEND");
        this.f15236b = intent;
        intent.setType("text/plain");
    }
}
