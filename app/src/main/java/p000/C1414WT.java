package p000;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import expo.modules.filesystem.DeletingOptions;
import expo.modules.filesystem.DownloadOptions;
import expo.modules.filesystem.FileSystemUploadOptions;
import expo.modules.filesystem.InfoOptions;
import expo.modules.filesystem.MakeDirectoryOptions;
import expo.modules.filesystem.ReadingOptions;
import expo.modules.filesystem.RelocatingOptions;
import expo.modules.filesystem.WritingOptions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m22267d2 = {"LWT;", "Lws0;", "<init>", "()V", "LAs0;", "a", "()LAs0;", "IT", "JT", "PT", "KT", "LT", "expo-file-system_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* renamed from: WT */
/* loaded from: classes2.dex */
public final class C1414WT extends AbstractC11598ws0 {

    /* renamed from: c */
    public C10585ox0 f13194c;

    /* renamed from: d */
    public InterfaceC11518wE0 f13195d;

    /* renamed from: e */
    public final HashMap f13196e = new HashMap();

    /* renamed from: f */
    public final C1068Qy f13197f = AbstractC11432vY1.m25444a(C0399GK.f3695b);

    /* renamed from: d */
    public static final void m8764d(C1414WT c1414wt, Uri uri) throws IOException {
        c1414wt.getClass();
        File fileM8775t = m8775t(uri);
        File parentFile = fileM8775t.getParentFile();
        if (parentFile == null || !parentFile.exists()) {
            throw new IOException(AbstractC11153tN0.m24912x("Directory for '", fileM8775t.getPath(), "' doesn't exist. Please make sure directory '", fileM8775t.getParent(), "' exists before calling downloadAsync."));
        }
    }

    /* renamed from: e */
    public static final Uri m8765e(C1414WT c1414wt, File file) throws C6861t2 {
        Activity activityM985a = c1414wt.m25721b().m985a();
        if (activityM985a == null) {
            throw new C6861t2(8);
        }
        Uri uriM2663d = AbstractC0345FT.m2663d(activityM985a.getApplication(), activityM985a.getApplication().getPackageName() + ".FileSystemFileProvider", file);
        O90.m5967e(uriM2663d, "getUriForFile(...)");
        return uriM2663d;
    }

    /* renamed from: f */
    public static final C10777qR0 m8766f(C1414WT c1414wt, String str, String str2, FileSystemUploadOptions fileSystemUploadOptions, InterfaceC11289uR0 interfaceC11289uR0) throws Exception {
        AbstractC11161tR0 abstractC11161tR0Mo17843G;
        c1414wt.getClass();
        Uri uri = Uri.parse(AbstractC1477XT.m9053a(str2));
        O90.m5965c(uri);
        c1414wt.m8776l(uri, OA0.f8264a);
        File fileM8775t = m8775t(uri);
        if (!fileM8775t.exists()) {
            throw new IOException(AbstractC7222ym.m26234k("Directory for '", fileM8775t.getPath(), "' doesn't exist."));
        }
        C6937uF c6937uF = new C6937uF(9, false);
        c6937uF.m25136G(str);
        Map<String, String> headers = fileSystemUploadOptions.getHeaders();
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                c6937uF.m25139k(entry.getKey(), entry.getValue());
            }
        }
        File fileM8775t2 = m8775t(uri);
        int i = AbstractC0785MT.f7171a[fileSystemUploadOptions.getUploadType().ordinal()];
        if (i == 1) {
            abstractC11161tR0Mo17843G = interfaceC11289uR0.mo17843G(new C1509Xz(null, 1, fileM8775t2));
        } else {
            if (i != 2) {
                throw new C6838sg();
            }
            String string = UUID.randomUUID().toString();
            O90.m5967e(string, "randomUUID().toString()");
            C0551Ik c0551Ik = C0551Ik.f5116d;
            C0551Ik c0551IkM7631D = C1210TE.m7631D(string);
            C8540Xp0 c8540Xp0 = C11854yt0.f46525e;
            ArrayList arrayList = new ArrayList();
            C8540Xp0 c8540Xp02 = C11854yt0.f46526f;
            O90.m5968f(c8540Xp02, "type");
            if (!c8540Xp02.f13989b.equals("multipart")) {
                throw new IllegalArgumentException(("multipart != " + c8540Xp02).toString());
            }
            Map<String, String> parameters = fileSystemUploadOptions.getParameters();
            if (parameters != null) {
                for (Map.Entry<String, String> entry2 : parameters.entrySet()) {
                    String key = entry2.getKey();
                    String string2 = entry2.getValue().toString();
                    O90.m5968f(key, "name");
                    O90.m5968f(string2, "value");
                    arrayList.add(AbstractC11767yB1.m26091a(key, null, C10689pl0.m23864i(string2, null)));
                }
            }
            String mimeType = fileSystemUploadOptions.getMimeType();
            if (mimeType == null) {
                mimeType = URLConnection.guessContentTypeFromName(fileM8775t2.getName());
                O90.m5967e(mimeType, "guessContentTypeFromName(...)");
            }
            String fieldName = fileSystemUploadOptions.getFieldName();
            if (fieldName == null) {
                fieldName = fileM8775t2.getName();
            }
            O90.m5965c(fieldName);
            String name = fileM8775t2.getName();
            Pattern pattern = C8540Xp0.f13986d;
            arrayList.add(AbstractC11767yB1.m26091a(fieldName, name, interfaceC11289uR0.mo17843G(new C1509Xz(AbstractC11511wA1.m25570c(mimeType), 1, fileM8775t2))));
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            abstractC11161tR0Mo17843G = new C11854yt0(c0551IkM7631D, c8540Xp02, AbstractC7433Ch1.m1296y(arrayList));
        }
        c6937uF.m25130A(fileSystemUploadOptions.getHttpMethod().getValue(), abstractC11161tR0Mo17843G);
        return c6937uF.m25141o();
    }

    /* renamed from: g */
    public static final void m8767g(C1414WT c1414wt, File file) throws IOException {
        c1414wt.getClass();
        if (file.isDirectory() || file.mkdirs()) {
            return;
        }
        throw new IOException("Couldn't create directory '" + file + "'");
    }

    /* renamed from: h */
    public static final C10585ox0 m8768h(C1414WT c1414wt) {
        C10585ox0 c10585ox0;
        synchronized (c1414wt) {
            try {
                if (c1414wt.f13194c == null) {
                    C10457nx0 c10457nx0 = new C10457nx0();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    c10457nx0.m23286a(60L, timeUnit);
                    c10457nx0.m23287b(60L, timeUnit);
                    c10457nx0.m23289d(60L, timeUnit);
                    c1414wt.f13194c = new C10585ox0(c10457nx0);
                }
                c10585ox0 = c1414wt.f13194c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c10585ox0;
    }

    /* renamed from: i */
    public static final String m8769i(C1414WT c1414wt, File file) {
        c1414wt.getClass();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            String str = new String(AbstractC8675a30.m9668a(RZ1.m7039d(fileInputStream)));
            AbstractC8729aT1.m9749a(fileInputStream, null);
            return str;
        } finally {
        }
    }

    /* renamed from: j */
    public static final InputStream m8770j(C1414WT c1414wt, String str) throws Resources.NotFoundException, FileNotFoundException {
        int identifier = c1414wt.m8778o().getResources().getIdentifier(str, Core.RAW, c1414wt.m8778o().getPackageName());
        if (identifier == 0 && (identifier = c1414wt.m8778o().getResources().getIdentifier(str, "drawable", c1414wt.m8778o().getPackageName())) == 0) {
            throw new FileNotFoundException(AbstractC7222ym.m26234k("No resource found with the name '", str, "'"));
        }
        InputStream inputStreamOpenRawResource = c1414wt.m8778o().getResources().openRawResource(identifier);
        O90.m5967e(inputStreamOpenRawResource, "openRawResource(...)");
        return inputStreamOpenRawResource;
    }

    /* renamed from: k */
    public static final Bundle m8771k(C1414WT c1414wt, K20 k20) {
        c1414wt.getClass();
        Bundle bundle = new Bundle();
        int size = k20.size();
        for (int i = 0; i < size; i++) {
            String strM4525d = k20.m4525d(i);
            if (bundle.containsKey(strM4525d)) {
                bundle.putString(strM4525d, bundle.getString(strM4525d) + ", " + k20.m4528q(i));
            } else {
                bundle.putString(strM4525d, k20.m4528q(i));
            }
        }
        return bundle;
    }

    /* renamed from: n */
    public static void m8772n(File file) throws IOException {
        if (!file.isDirectory()) {
            if (!file.delete()) {
                throw new IOException(AbstractC1374Vq.m8588g(file, "Unable to delete file: "));
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(AbstractC1374Vq.m8588g(file, "Failed to list contents of "));
        }
        IOException e = null;
        for (File file2 : fileArrListFiles) {
            try {
                O90.m5965c(file2);
                m8772n(file2);
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e != null) {
            throw e;
        }
        if (file.delete()) {
            return;
        }
        throw new IOException("Unable to delete directory " + file + ".");
    }

    /* renamed from: p */
    public static long m8773p(File file) {
        Object obj;
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return 0L;
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file2 : fileArrListFiles) {
            O90.m5965c(file2);
            arrayList.add(Long.valueOf(m8773p(file2)));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Long.valueOf(((Number) next).longValue() + ((Number) it.next()).longValue());
            }
            obj = next;
        } else {
            obj = null;
        }
        Long l = (Long) obj;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    /* renamed from: r */
    public static boolean m8774r(Uri uri) {
        if (!O90.m5963a(uri.getScheme(), RemoteMessageConst.Notification.CONTENT)) {
            return false;
        }
        String host = uri.getHost();
        return host != null ? D51.m1556o(host, "com.android.externalstorage", false) : false;
    }

    /* renamed from: t */
    public static File m8775t(Uri uri) {
        if (uri.getPath() == null) {
            throw new IOException(AbstractC11153tN0.m24911w("Invalid Uri: ", uri));
        }
        String path = uri.getPath();
        O90.m5965c(path);
        return new File(path);
    }

    @Override // p000.AbstractC11598ws0
    @SuppressLint({"WrongConstant", "DiscouragedApi"})
    /* renamed from: a */
    public final C7350As0 mo2834a() {
        C6599p9 c0486Hi;
        C6599p9 c0486Hi2;
        C6599p9 c0486Hi3;
        C6599p9 c0486Hi4;
        C6599p9 c0486Hi5;
        C6599p9 c0486Hi6;
        OY1.m6083a("[ExpoModulesCore] " + (C1414WT.class + ".ModuleDefinition"));
        try {
            C11979zs0 c11979zs0 = new C11979zs0(this);
            LinkedHashMap linkedHashMap = (LinkedHashMap) c11979zs0.f47063i;
            c11979zs0.m26560a();
            c11979zs0.f47056b = new C10801qd0(14, new Pair[]{AbstractC8869bZ1.m10460b("documentDirectory", Uri.fromFile(m8778o().getFilesDir()).toString() + "/"), AbstractC8869bZ1.m10460b("cacheDirectory", Uri.fromFile(m8778o().getCacheDir()).toString() + "/"), AbstractC8869bZ1.m10460b("bundleDirectory", "asset:///")});
            c11979zs0.f47057c = new C7621Fx1(new String[]{"expo-file-system.downloadProgress", "expo-file-system.uploadProgress"});
            EnumC0844NP enumC0844NP = EnumC0844NP.f7754a;
            linkedHashMap.put(enumC0844NP, new C0987Pg(enumC0844NP, new C1288UT(this, 0)));
            C0887O5[] c0887o5Arr = {new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1450X2.f13499G)), new C0887O5(new C8420Vh0(BP0.m713a(InfoOptions.class), false, C1162ST.f10782h))};
            C1037QT c1037qt = new C1037QT(this, 9);
            Class cls = Integer.TYPE;
            c11979zs0.m26562c().put("getInfoAsync", O90.m5963a(Bundle.class, cls) ? new C0486Hi("getInfoAsync", c0887o5Arr, c1037qt, 3) : O90.m5963a(Bundle.class, Boolean.TYPE) ? new C0486Hi("getInfoAsync", c0887o5Arr, c1037qt, 0) : O90.m5963a(Bundle.class, Double.TYPE) ? new C0486Hi("getInfoAsync", c0887o5Arr, c1037qt, 1) : O90.m5963a(Bundle.class, Float.TYPE) ? new C0486Hi("getInfoAsync", c0887o5Arr, c1037qt, 2) : O90.m5963a(Bundle.class, String.class) ? new C0486Hi("getInfoAsync", c0887o5Arr, c1037qt, 4) : new C6599p9("getInfoAsync", c0887o5Arr, c1037qt));
            c11979zs0.m26562c().put("readAsStringAsync", new C6599p9("readAsStringAsync", new C0887O5[]{new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1162ST.f10791q)), new C0887O5(new C8420Vh0(BP0.m713a(ReadingOptions.class), false, C1162ST.f10792r))}, new C1037QT(this, 13)));
            C0887O5[] c0887o5Arr2 = {new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1162ST.f10793s)), new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1162ST.f10794t)), new C0887O5(new C8420Vh0(BP0.m713a(WritingOptions.class), false, C1162ST.f10795u))};
            C1037QT c1037qt2 = new C1037QT(this, 0);
            c11979zs0.m26562c().put("writeAsStringAsync", O90.m5963a(C8313Tf1.class, cls) ? new C0486Hi("writeAsStringAsync", c0887o5Arr2, c1037qt2, 3) : O90.m5963a(C8313Tf1.class, Boolean.TYPE) ? new C0486Hi("writeAsStringAsync", c0887o5Arr2, c1037qt2, 0) : O90.m5963a(C8313Tf1.class, Double.TYPE) ? new C0486Hi("writeAsStringAsync", c0887o5Arr2, c1037qt2, 1) : O90.m5963a(C8313Tf1.class, Float.TYPE) ? new C0486Hi("writeAsStringAsync", c0887o5Arr2, c1037qt2, 2) : O90.m5963a(C8313Tf1.class, String.class) ? new C0486Hi("writeAsStringAsync", c0887o5Arr2, c1037qt2, 4) : new C6599p9("writeAsStringAsync", c0887o5Arr2, c1037qt2));
            C0887O5[] c0887o5Arr3 = {new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1450X2.f13495C)), new C0887O5(new C8420Vh0(BP0.m713a(DeletingOptions.class), false, C1450X2.f13496D))};
            C1037QT c1037qt3 = new C1037QT(this, 1);
            c11979zs0.m26562c().put("deleteAsync", O90.m5963a(C8313Tf1.class, cls) ? new C0486Hi("deleteAsync", c0887o5Arr3, c1037qt3, 3) : O90.m5963a(C8313Tf1.class, Boolean.TYPE) ? new C0486Hi("deleteAsync", c0887o5Arr3, c1037qt3, 0) : O90.m5963a(C8313Tf1.class, Double.TYPE) ? new C0486Hi("deleteAsync", c0887o5Arr3, c1037qt3, 1) : O90.m5963a(C8313Tf1.class, Float.TYPE) ? new C0486Hi("deleteAsync", c0887o5Arr3, c1037qt3, 2) : O90.m5963a(C8313Tf1.class, String.class) ? new C0486Hi("deleteAsync", c0887o5Arr3, c1037qt3, 4) : new C6599p9("deleteAsync", c0887o5Arr3, c1037qt3));
            if (O90.m5963a(RelocatingOptions.class, InterfaceC11518wE0.class)) {
                c0486Hi = new C6599p9("moveAsync", new C0887O5[0], new C1099RT(this, 0));
            } else {
                C0887O5[] c0887o5Arr4 = {new C0887O5(new C8420Vh0(BP0.m713a(RelocatingOptions.class), false, C1450X2.f13497E))};
                C1037QT c1037qt4 = new C1037QT(this, 2);
                c0486Hi = O90.m5963a(C8313Tf1.class, cls) ? new C0486Hi("moveAsync", c0887o5Arr4, c1037qt4, 3) : O90.m5963a(C8313Tf1.class, Boolean.TYPE) ? new C0486Hi("moveAsync", c0887o5Arr4, c1037qt4, 0) : O90.m5963a(C8313Tf1.class, Double.TYPE) ? new C0486Hi("moveAsync", c0887o5Arr4, c1037qt4, 1) : O90.m5963a(C8313Tf1.class, Float.TYPE) ? new C0486Hi("moveAsync", c0887o5Arr4, c1037qt4, 2) : O90.m5963a(C8313Tf1.class, String.class) ? new C0486Hi("moveAsync", c0887o5Arr4, c1037qt4, 4) : new C6599p9("moveAsync", c0887o5Arr4, c1037qt4);
            }
            c11979zs0.m26562c().put("moveAsync", c0486Hi);
            if (O90.m5963a(RelocatingOptions.class, InterfaceC11518wE0.class)) {
                c0486Hi2 = new C6599p9("copyAsync", new C0887O5[0], new C1099RT(this, 1));
            } else {
                C0887O5[] c0887o5Arr5 = {new C0887O5(new C8420Vh0(BP0.m713a(RelocatingOptions.class), false, C1450X2.f13498F))};
                C1037QT c1037qt5 = new C1037QT(this, 3);
                if (O90.m5963a(Object.class, cls)) {
                    c0486Hi2 = new C0486Hi("copyAsync", c0887o5Arr5, c1037qt5, 3);
                } else {
                    c0486Hi2 = O90.m5963a(Object.class, Boolean.TYPE) ? new C0486Hi("copyAsync", c0887o5Arr5, c1037qt5, 0) : O90.m5963a(Object.class, Double.TYPE) ? new C0486Hi("copyAsync", c0887o5Arr5, c1037qt5, 1) : O90.m5963a(Object.class, Float.TYPE) ? new C0486Hi("copyAsync", c0887o5Arr5, c1037qt5, 2) : O90.m5963a(Object.class, String.class) ? new C0486Hi("copyAsync", c0887o5Arr5, c1037qt5, 4) : new C6599p9("copyAsync", c0887o5Arr5, c1037qt5);
                }
            }
            c11979zs0.m26562c().put("copyAsync", c0486Hi2);
            C0887O5[] c0887o5Arr6 = {new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1450X2.f13500H)), new C0887O5(new C8420Vh0(BP0.m713a(MakeDirectoryOptions.class), false, C1450X2.f13501I))};
            C1037QT c1037qt6 = new C1037QT(this, 4);
            c11979zs0.m26562c().put("makeDirectoryAsync", O90.m5963a(C8313Tf1.class, cls) ? new C0486Hi("makeDirectoryAsync", c0887o5Arr6, c1037qt6, 3) : O90.m5963a(C8313Tf1.class, Boolean.TYPE) ? new C0486Hi("makeDirectoryAsync", c0887o5Arr6, c1037qt6, 0) : O90.m5963a(C8313Tf1.class, Double.TYPE) ? new C0486Hi("makeDirectoryAsync", c0887o5Arr6, c1037qt6, 1) : O90.m5963a(C8313Tf1.class, Float.TYPE) ? new C0486Hi("makeDirectoryAsync", c0887o5Arr6, c1037qt6, 2) : O90.m5963a(C8313Tf1.class, String.class) ? new C0486Hi("makeDirectoryAsync", c0887o5Arr6, c1037qt6, 4) : new C6599p9("makeDirectoryAsync", c0887o5Arr6, c1037qt6));
            if (O90.m5963a(String.class, InterfaceC11518wE0.class)) {
                c0486Hi3 = new C6599p9("readDirectoryAsync", new C0887O5[0], new C1099RT(this, 2));
            } else {
                C0887O5[] c0887o5Arr7 = {new C0887O5(new C8420Vh0(BP0.m713a(String.class), true, C1162ST.f10780f))};
                C1037QT c1037qt7 = new C1037QT(this, 5);
                c0486Hi3 = O90.m5963a(List.class, cls) ? new C0486Hi("readDirectoryAsync", c0887o5Arr7, c1037qt7, 3) : O90.m5963a(List.class, Boolean.TYPE) ? new C0486Hi("readDirectoryAsync", c0887o5Arr7, c1037qt7, 0) : O90.m5963a(List.class, Double.TYPE) ? new C0486Hi("readDirectoryAsync", c0887o5Arr7, c1037qt7, 1) : O90.m5963a(List.class, Float.TYPE) ? new C0486Hi("readDirectoryAsync", c0887o5Arr7, c1037qt7, 2) : O90.m5963a(List.class, String.class) ? new C0486Hi("readDirectoryAsync", c0887o5Arr7, c1037qt7, 4) : new C6599p9("readDirectoryAsync", c0887o5Arr7, c1037qt7);
            }
            c11979zs0.m26562c().put("readDirectoryAsync", c0486Hi3);
            C0887O5[] c0887o5Arr8 = new C0887O5[0];
            C8237Rt1 c8237Rt1 = new C8237Rt1(12);
            c11979zs0.m26562c().put("getTotalDiskCapacityAsync", O90.m5963a(Double.class, cls) ? new C0486Hi("getTotalDiskCapacityAsync", c0887o5Arr8, c8237Rt1, 3) : O90.m5963a(Double.class, Boolean.TYPE) ? new C0486Hi("getTotalDiskCapacityAsync", c0887o5Arr8, c8237Rt1, 0) : O90.m5963a(Double.class, Double.TYPE) ? new C0486Hi("getTotalDiskCapacityAsync", c0887o5Arr8, c8237Rt1, 1) : O90.m5963a(Double.class, Float.TYPE) ? new C0486Hi("getTotalDiskCapacityAsync", c0887o5Arr8, c8237Rt1, 2) : O90.m5963a(Double.class, String.class) ? new C0486Hi("getTotalDiskCapacityAsync", c0887o5Arr8, c8237Rt1, 4) : new C6599p9("getTotalDiskCapacityAsync", c0887o5Arr8, c8237Rt1));
            C0887O5[] c0887o5Arr9 = new C0887O5[0];
            C8237Rt1 c8237Rt12 = new C8237Rt1(13);
            c11979zs0.m26562c().put("getFreeDiskStorageAsync", O90.m5963a(Double.class, cls) ? new C0486Hi("getFreeDiskStorageAsync", c0887o5Arr9, c8237Rt12, 3) : O90.m5963a(Double.class, Boolean.TYPE) ? new C0486Hi("getFreeDiskStorageAsync", c0887o5Arr9, c8237Rt12, 0) : O90.m5963a(Double.class, Double.TYPE) ? new C0486Hi("getFreeDiskStorageAsync", c0887o5Arr9, c8237Rt12, 1) : O90.m5963a(Double.class, Float.TYPE) ? new C0486Hi("getFreeDiskStorageAsync", c0887o5Arr9, c8237Rt12, 2) : O90.m5963a(Double.class, String.class) ? new C0486Hi("getFreeDiskStorageAsync", c0887o5Arr9, c8237Rt12, 4) : new C6599p9("getFreeDiskStorageAsync", c0887o5Arr9, c8237Rt12));
            if (O90.m5963a(String.class, InterfaceC11518wE0.class)) {
                c0486Hi4 = new C6599p9("getContentUriAsync", new C0887O5[0], new C1099RT(this, 3));
            } else {
                C0887O5[] c0887o5Arr10 = {new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1162ST.f10781g))};
                C1037QT c1037qt8 = new C1037QT(this, 6);
                c0486Hi4 = O90.m5963a(String.class, cls) ? new C0486Hi("getContentUriAsync", c0887o5Arr10, c1037qt8, 3) : O90.m5963a(String.class, Boolean.TYPE) ? new C0486Hi("getContentUriAsync", c0887o5Arr10, c1037qt8, 0) : O90.m5963a(String.class, Double.TYPE) ? new C0486Hi("getContentUriAsync", c0887o5Arr10, c1037qt8, 1) : O90.m5963a(String.class, Float.TYPE) ? new C0486Hi("getContentUriAsync", c0887o5Arr10, c1037qt8, 2) : O90.m5963a(String.class, String.class) ? new C0486Hi("getContentUriAsync", c0887o5Arr10, c1037qt8, 4) : new C6599p9("getContentUriAsync", c0887o5Arr10, c1037qt8);
            }
            c11979zs0.m26562c().put("getContentUriAsync", c0486Hi4);
            if (O90.m5963a(String.class, InterfaceC11518wE0.class)) {
                c0486Hi5 = new C6599p9("readSAFDirectoryAsync", new C0887O5[0], new C1099RT(this, 4));
            } else {
                C0887O5[] c0887o5Arr11 = {new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1162ST.f10783i))};
                C1037QT c1037qt9 = new C1037QT(this, 7);
                c0486Hi5 = O90.m5963a(List.class, cls) ? new C0486Hi("readSAFDirectoryAsync", c0887o5Arr11, c1037qt9, 3) : O90.m5963a(List.class, Boolean.TYPE) ? new C0486Hi("readSAFDirectoryAsync", c0887o5Arr11, c1037qt9, 0) : O90.m5963a(List.class, Double.TYPE) ? new C0486Hi("readSAFDirectoryAsync", c0887o5Arr11, c1037qt9, 1) : O90.m5963a(List.class, Float.TYPE) ? new C0486Hi("readSAFDirectoryAsync", c0887o5Arr11, c1037qt9, 2) : O90.m5963a(List.class, String.class) ? new C0486Hi("readSAFDirectoryAsync", c0887o5Arr11, c1037qt9, 4) : new C6599p9("readSAFDirectoryAsync", c0887o5Arr11, c1037qt9);
            }
            c11979zs0.m26562c().put("readSAFDirectoryAsync", c0486Hi5);
            C0887O5[] c0887o5Arr12 = {new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1162ST.f10784j)), new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1162ST.f10785k))};
            C1037QT c1037qt10 = new C1037QT(this, 8);
            c11979zs0.m26562c().put("makeSAFDirectoryAsync", O90.m5963a(String.class, cls) ? new C0486Hi("makeSAFDirectoryAsync", c0887o5Arr12, c1037qt10, 3) : O90.m5963a(String.class, Boolean.TYPE) ? new C0486Hi("makeSAFDirectoryAsync", c0887o5Arr12, c1037qt10, 0) : O90.m5963a(String.class, Double.TYPE) ? new C0486Hi("makeSAFDirectoryAsync", c0887o5Arr12, c1037qt10, 1) : O90.m5963a(String.class, Float.TYPE) ? new C0486Hi("makeSAFDirectoryAsync", c0887o5Arr12, c1037qt10, 2) : O90.m5963a(String.class, String.class) ? new C0486Hi("makeSAFDirectoryAsync", c0887o5Arr12, c1037qt10, 4) : new C6599p9("makeSAFDirectoryAsync", c0887o5Arr12, c1037qt10));
            C0887O5[] c0887o5Arr13 = {new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1162ST.f10786l)), new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1162ST.f10787m)), new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1162ST.f10788n))};
            C1037QT c1037qt11 = new C1037QT(this, 10);
            c11979zs0.m26562c().put("createSAFFileAsync", O90.m5963a(String.class, cls) ? new C0486Hi("createSAFFileAsync", c0887o5Arr13, c1037qt11, 3) : O90.m5963a(String.class, Boolean.TYPE) ? new C0486Hi("createSAFFileAsync", c0887o5Arr13, c1037qt11, 0) : O90.m5963a(String.class, Double.TYPE) ? new C0486Hi("createSAFFileAsync", c0887o5Arr13, c1037qt11, 1) : O90.m5963a(String.class, Float.TYPE) ? new C0486Hi("createSAFFileAsync", c0887o5Arr13, c1037qt11, 2) : O90.m5963a(String.class, String.class) ? new C0486Hi("createSAFFileAsync", c0887o5Arr13, c1037qt11, 4) : new C6599p9("createSAFFileAsync", c0887o5Arr13, c1037qt11));
            c11979zs0.m26562c().put("requestDirectoryPermissionsAsync", new C6599p9("requestDirectoryPermissionsAsync", new C0887O5[]{new C0887O5(new C8420Vh0(BP0.m713a(String.class), true, C1162ST.f10774D))}, new C1099RT(this, 10)));
            c11979zs0.m26562c().put("uploadAsync", new C6599p9("uploadAsync", new C0887O5[]{new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1162ST.f10776F)), new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1162ST.f10777G)), new C0887O5(new C8420Vh0(BP0.m713a(FileSystemUploadOptions.class), false, C1162ST.f10778H))}, new C1099RT(this, c11979zs0)));
            c11979zs0.m26562c().put("uploadTaskStartAsync", new C6599p9("uploadTaskStartAsync", new C0887O5[]{new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1162ST.f10779I)), new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1225TT.f11370f)), new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1225TT.f11371g)), new C0887O5(new C8420Vh0(BP0.m713a(FileSystemUploadOptions.class), false, C1162ST.f10796v))}, new C1099RT(this, 7)));
            c11979zs0.m26562c().put("downloadAsync", new C6599p9("downloadAsync", new C0887O5[]{new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1162ST.f10797w)), new C0887O5(new C8420Vh0(BP0.m713a(String.class), true, C1162ST.f10798x)), new C0887O5(new C8420Vh0(BP0.m713a(DownloadOptions.class), false, C1162ST.f10799y))}, new C1099RT(this, 8)));
            c11979zs0.m26562c().put("networkTaskCancelAsync", O90.m5963a(String.class, InterfaceC11518wE0.class) ? new C6599p9("networkTaskCancelAsync", new C0887O5[0], new C1099RT(this, 5)) : new C6599p9("networkTaskCancelAsync", new C0887O5[]{new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1162ST.f10789o))}, new C1037QT(this, 11)));
            c11979zs0.m26562c().put("downloadResumableStartAsync", new C6599p9("downloadResumableStartAsync", new C0887O5[]{new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1162ST.f10800z)), new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1162ST.f10771A)), new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1162ST.f10772B)), new C0887O5(new C8420Vh0(BP0.m713a(DownloadOptions.class), false, C1162ST.f10773C)), new C0887O5(new C8420Vh0(BP0.m713a(String.class), true, C1162ST.f10775E))}, new C1099RT(this, 9)));
            if (O90.m5963a(String.class, InterfaceC11518wE0.class)) {
                c0486Hi6 = new C6599p9("downloadResumablePauseAsync", new C0887O5[0], new C1099RT(this, 6));
            } else {
                C0887O5[] c0887o5Arr14 = {new C0887O5(new C8420Vh0(BP0.m713a(String.class), false, C1162ST.f10790p))};
                C1037QT c1037qt12 = new C1037QT(this, 12);
                c0486Hi6 = O90.m5963a(Bundle.class, cls) ? new C0486Hi("downloadResumablePauseAsync", c0887o5Arr14, c1037qt12, 3) : O90.m5963a(Bundle.class, Boolean.TYPE) ? new C0486Hi("downloadResumablePauseAsync", c0887o5Arr14, c1037qt12, 0) : O90.m5963a(Bundle.class, Double.TYPE) ? new C0486Hi("downloadResumablePauseAsync", c0887o5Arr14, c1037qt12, 1) : O90.m5963a(Bundle.class, Float.TYPE) ? new C0486Hi("downloadResumablePauseAsync", c0887o5Arr14, c1037qt12, 2) : O90.m5963a(Bundle.class, String.class) ? new C0486Hi("downloadResumablePauseAsync", c0887o5Arr14, c1037qt12, 4) : new C6599p9("downloadResumablePauseAsync", c0887o5Arr14, c1037qt12);
            }
            c11979zs0.m26562c().put("downloadResumablePauseAsync", c0486Hi6);
            linkedHashMap.put(EnumC0844NP.f7760g, new C0215DP(new C1099RT(this, 12)));
            EnumC0844NP enumC0844NP2 = EnumC0844NP.f7755b;
            linkedHashMap.put(enumC0844NP2, new C0987Pg(enumC0844NP2, new C1288UT(this, 1)));
            C7350As0 c7350As0M26561b = c11979zs0.m26561b();
            Trace.endSection();
            return c7350As0M26561b;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* renamed from: l */
    public final void m8776l(Uri uri, OA0 oa0) throws Exception {
        if (oa0 == OA0.f8264a) {
            m8777m(uri, oa0, F91.m2538u("Location '", uri, "' isn't readable."));
        }
        if (oa0 == OA0.f8265b) {
            m8777m(uri, oa0, F91.m2538u("Location '", uri, "' isn't writable."));
        }
        m8777m(uri, oa0, "Location '" + uri + "' doesn't have permission '" + oa0.name() + "'.");
    }

    /* renamed from: m */
    public final void m8777m(Uri uri, OA0 oa0, String str) throws Exception {
        EnumSet enumSetOf;
        Object obj;
        boolean zM8774r = m8774r(uri);
        OA0 oa02 = OA0.f8264a;
        if (zM8774r) {
            YZ1 yz1M8779q = m8779q(uri);
            enumSetOf = EnumSet.noneOf(OA0.class);
            if (yz1M8779q.mo9312a()) {
                enumSetOf.add(oa02);
            }
            if (yz1M8779q.mo9313b()) {
                enumSetOf.add(OA0.f8265b);
            }
            O90.m5967e(enumSetOf, "apply(...)");
        } else if (O90.m5963a(uri.getScheme(), RemoteMessageConst.Notification.CONTENT) || O90.m5963a(uri.getScheme(), "asset")) {
            enumSetOf = EnumSet.of(oa02);
        } else if (O90.m5963a(uri.getScheme(), "file")) {
            String path = uri.getPath();
            try {
                obj = m25721b().f1196a.f5762a.get(C0156CT.class);
            } catch (Exception unused) {
                obj = null;
            }
            enumSetOf = ((C0156CT) obj) != null ? C0156CT.m1190c(m8778o(), path) : null;
        } else {
            enumSetOf = uri.getScheme() == null ? EnumSet.of(oa02) : EnumSet.noneOf(OA0.class);
        }
        if (enumSetOf == null || !enumSetOf.contains(oa0)) {
            throw new IOException(str);
        }
    }

    /* renamed from: o */
    public final Context m8778o() throws C6861t2 {
        Context contextM987c = m25721b().m987c();
        if (contextM987c != null) {
            return contextM987c;
        }
        throw new C6861t2(6);
    }

    /* renamed from: q */
    public final YZ1 m8779q(Uri uri) throws Exception {
        Context contextM8778o = m8778o();
        C9827j11 c9827j11 = new C9827j11();
        c9827j11.f34846b = contextM8778o;
        c9827j11.f34847c = uri;
        String strM9657f = AbstractC8668a02.m9657f(contextM8778o, uri, "mime_type");
        return ("vnd.android.document/directory".equals(strM9657f) || TextUtils.isEmpty(strM9657f)) ? new C9827j11(m8778o(), DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri))) : c9827j11;
    }

    /* renamed from: s */
    public final InputStream m8780s(Uri uri) throws IOException {
        String path = uri.getPath();
        if (path == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String strSubstring = path.substring(1);
        O90.m5967e(strSubstring, "substring(...)");
        InputStream inputStreamOpen = m8778o().getAssets().open(strSubstring);
        O90.m5967e(inputStreamOpen, "open(...)");
        return inputStreamOpen;
    }

    /* renamed from: u */
    public final void m8781u(YZ1 yz1, File file, boolean z) throws IOException {
        if (!yz1.mo9317f()) {
            return;
        }
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("Couldn't create folder in output dir.");
            }
        } else if (!file.exists() && !file.mkdirs()) {
            throw new IOException("Couldn't create folder in output dir.");
        }
        if (yz1.mo9320i()) {
            YZ1[] yz1ArrMo9321j = yz1.mo9321j();
            O90.m5967e(yz1ArrMo9321j, "listFiles(...)");
            for (YZ1 yz12 : yz1ArrMo9321j) {
                O90.m5965c(yz12);
                m8781u(yz12, file, z);
            }
            if (z) {
                return;
            }
            yz1.mo9316e();
            return;
        }
        String strMo9318g = yz1.mo9318g();
        if (strMo9318g == null) {
            return;
        }
        File file2 = file.isDirectory() ? new File(file.getPath(), strMo9318g) : new File(file.getPath());
        InputStream inputStreamOpenInputStream = m8778o().getContentResolver().openInputStream(yz1.mo9319h());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                AbstractC9069d50.m17491a(inputStreamOpenInputStream, fileOutputStream);
                AbstractC8729aT1.m9749a(fileOutputStream, null);
                AbstractC8729aT1.m9749a(inputStreamOpenInputStream, null);
                if (z) {
                    return;
                }
                yz1.mo9316e();
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC8729aT1.m9749a(inputStreamOpenInputStream, th);
                throw th2;
            }
        }
    }
}
