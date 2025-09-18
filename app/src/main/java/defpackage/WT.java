package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.rn.push.constants.Core;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"LWT;", "Lws0;", "<init>", "()V", "LAs0;", "a", "()LAs0;", "IT", "JT", "PT", "KT", "LT", "expo-file-system_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WT extends AbstractC7874ws0 {
    public C6363ox0 c;
    public InterfaceC7754wE0 d;
    public final HashMap e = new HashMap();
    public final C1339Qy f = AbstractC7625vY1.a(GK.b);

    public static final void d(WT wt, Uri uri) throws IOException {
        wt.getClass();
        File fileT = t(uri);
        File parentFile = fileT.getParentFile();
        if (parentFile == null || !parentFile.exists()) {
            throw new IOException(AbstractC7209tN0.x("Directory for '", fileT.getPath(), "' doesn't exist. Please make sure directory '", fileT.getParent(), "' exists before calling downloadAsync."));
        }
    }

    public static final Uri e(WT wt, File file) throws C7143t2 {
        Activity activityA = wt.b().a();
        if (activityA == null) {
            throw new C7143t2(8);
        }
        Uri uriD = FT.d(activityA.getApplication(), activityA.getApplication().getPackageName() + ".FileSystemFileProvider", file);
        O90.e(uriD, "getUriForFile(...)");
        return uriD;
    }

    public static final C6649qR0 f(WT wt, String str, String str2, FileSystemUploadOptions fileSystemUploadOptions, InterfaceC7412uR0 interfaceC7412uR0) throws Exception {
        AbstractC7221tR0 abstractC7221tR0G;
        wt.getClass();
        Uri uri = Uri.parse(XT.a(str2));
        O90.c(uri);
        wt.l(uri, OA0.a);
        File fileT = t(uri);
        if (!fileT.exists()) {
            throw new IOException(AbstractC8235ym.k("Directory for '", fileT.getPath(), "' doesn't exist."));
        }
        C7375uF c7375uF = new C7375uF(9, false);
        c7375uF.G(str);
        Map<String, String> headers = fileSystemUploadOptions.getHeaders();
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                c7375uF.k(entry.getKey(), entry.getValue());
            }
        }
        File fileT2 = t(uri);
        int i = MT.a[fileSystemUploadOptions.getUploadType().ordinal()];
        if (i == 1) {
            abstractC7221tR0G = interfaceC7412uR0.G(new C1888Xz(null, 1, fileT2));
        } else {
            if (i != 2) {
                throw new C7074sg();
            }
            String string = UUID.randomUUID().toString();
            O90.e(string, "randomUUID().toString()");
            C0674Ik c0674Ik = C0674Ik.d;
            C0674Ik c0674IkD = TE.D(string);
            C1859Xp0 c1859Xp0 = C8257yt0.e;
            ArrayList arrayList = new ArrayList();
            C1859Xp0 c1859Xp02 = C8257yt0.f;
            O90.f(c1859Xp02, "type");
            if (!c1859Xp02.b.equals("multipart")) {
                throw new IllegalArgumentException(("multipart != " + c1859Xp02).toString());
            }
            Map<String, String> parameters = fileSystemUploadOptions.getParameters();
            if (parameters != null) {
                for (Map.Entry<String, String> entry2 : parameters.entrySet()) {
                    String key = entry2.getKey();
                    String string2 = entry2.getValue().toString();
                    O90.f(key, "name");
                    O90.f(string2, "value");
                    arrayList.add(AbstractC8126yB1.a(key, null, C6518pl0.i(string2, null)));
                }
            }
            String mimeType = fileSystemUploadOptions.getMimeType();
            if (mimeType == null) {
                mimeType = URLConnection.guessContentTypeFromName(fileT2.getName());
                O90.e(mimeType, "guessContentTypeFromName(...)");
            }
            String fieldName = fileSystemUploadOptions.getFieldName();
            if (fieldName == null) {
                fieldName = fileT2.getName();
            }
            O90.c(fieldName);
            String name = fileT2.getName();
            Pattern pattern = C1859Xp0.d;
            arrayList.add(AbstractC8126yB1.a(fieldName, name, interfaceC7412uR0.G(new C1888Xz(AbstractC7743wA1.c(mimeType), 1, fileT2))));
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            abstractC7221tR0G = new C8257yt0(c0674IkD, c1859Xp02, AbstractC0199Ch1.y(arrayList));
        }
        c7375uF.A(fileSystemUploadOptions.getHttpMethod().getValue(), abstractC7221tR0G);
        return c7375uF.o();
    }

    public static final void g(WT wt, File file) throws IOException {
        wt.getClass();
        if (file.isDirectory() || file.mkdirs()) {
            return;
        }
        throw new IOException("Couldn't create directory '" + file + "'");
    }

    public static final C6363ox0 h(WT wt) {
        C6363ox0 c6363ox0;
        synchronized (wt) {
            try {
                if (wt.c == null) {
                    C6172nx0 c6172nx0 = new C6172nx0();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    c6172nx0.a(60L, timeUnit);
                    c6172nx0.b(60L, timeUnit);
                    c6172nx0.d(60L, timeUnit);
                    wt.c = new C6363ox0(c6172nx0);
                }
                c6363ox0 = wt.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6363ox0;
    }

    public static final String i(WT wt, File file) {
        wt.getClass();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            String str = new String(AbstractC2061a30.a(RZ1.d(fileInputStream)));
            AbstractC2141aT1.a(fileInputStream, null);
            return str;
        } finally {
        }
    }

    public static final InputStream j(WT wt, String str) throws Resources.NotFoundException, FileNotFoundException {
        int identifier = wt.o().getResources().getIdentifier(str, Core.RAW, wt.o().getPackageName());
        if (identifier == 0 && (identifier = wt.o().getResources().getIdentifier(str, "drawable", wt.o().getPackageName())) == 0) {
            throw new FileNotFoundException(AbstractC8235ym.k("No resource found with the name '", str, "'"));
        }
        InputStream inputStreamOpenRawResource = wt.o().getResources().openRawResource(identifier);
        O90.e(inputStreamOpenRawResource, "openRawResource(...)");
        return inputStreamOpenRawResource;
    }

    public static final Bundle k(WT wt, K20 k20) {
        wt.getClass();
        Bundle bundle = new Bundle();
        int size = k20.size();
        for (int i = 0; i < size; i++) {
            String strD = k20.d(i);
            if (bundle.containsKey(strD)) {
                bundle.putString(strD, bundle.getString(strD) + ", " + k20.q(i));
            } else {
                bundle.putString(strD, k20.q(i));
            }
        }
        return bundle;
    }

    public static void n(File file) throws IOException {
        if (!file.isDirectory()) {
            if (!file.delete()) {
                throw new IOException(AbstractC1705Vq.g(file, "Unable to delete file: "));
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(AbstractC1705Vq.g(file, "Failed to list contents of "));
        }
        IOException e = null;
        for (File file2 : fileArrListFiles) {
            try {
                O90.c(file2);
                n(file2);
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

    public static long p(File file) {
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
            O90.c(file2);
            arrayList.add(Long.valueOf(p(file2)));
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

    public static boolean r(Uri uri) {
        if (!O90.a(uri.getScheme(), RemoteMessageConst.Notification.CONTENT)) {
            return false;
        }
        String host = uri.getHost();
        return host != null ? D51.o(host, "com.android.externalstorage", false) : false;
    }

    public static File t(Uri uri) {
        if (uri.getPath() == null) {
            throw new IOException(AbstractC7209tN0.w("Invalid Uri: ", uri));
        }
        String path = uri.getPath();
        O90.c(path);
        return new File(path);
    }

    @Override // defpackage.AbstractC7874ws0
    @SuppressLint({"WrongConstant", "DiscouragedApi"})
    public final C0075As0 a() {
        C6403p9 c0590Hi;
        C6403p9 c0590Hi2;
        C6403p9 c0590Hi3;
        C6403p9 c0590Hi4;
        C6403p9 c0590Hi5;
        C6403p9 c0590Hi6;
        OY1.a("[ExpoModulesCore] " + (WT.class + ".ModuleDefinition"));
        try {
            C8444zs0 c8444zs0 = new C8444zs0(this);
            LinkedHashMap linkedHashMap = (LinkedHashMap) c8444zs0.i;
            c8444zs0.a();
            c8444zs0.b = new C6685qd0(14, new Pair[]{AbstractC2350bZ1.b("documentDirectory", Uri.fromFile(o().getFilesDir()).toString() + "/"), AbstractC2350bZ1.b("cacheDirectory", Uri.fromFile(o().getCacheDir()).toString() + "/"), AbstractC2350bZ1.b("bundleDirectory", "asset:///")});
            c8444zs0.c = new C0481Fx1(new String[]{"expo-file-system.downloadProgress", "expo-file-system.uploadProgress"});
            NP np = NP.a;
            linkedHashMap.put(np, new C1207Pg(np, new UT(this, 0)));
            O5[] o5Arr = {new O5(new C1679Vh0(BP0.a(String.class), false, X2.G)), new O5(new C1679Vh0(BP0.a(InfoOptions.class), false, ST.h))};
            QT qt = new QT(this, 9);
            Class cls = Integer.TYPE;
            c8444zs0.c().put("getInfoAsync", O90.a(Bundle.class, cls) ? new C0590Hi("getInfoAsync", o5Arr, qt, 3) : O90.a(Bundle.class, Boolean.TYPE) ? new C0590Hi("getInfoAsync", o5Arr, qt, 0) : O90.a(Bundle.class, Double.TYPE) ? new C0590Hi("getInfoAsync", o5Arr, qt, 1) : O90.a(Bundle.class, Float.TYPE) ? new C0590Hi("getInfoAsync", o5Arr, qt, 2) : O90.a(Bundle.class, String.class) ? new C0590Hi("getInfoAsync", o5Arr, qt, 4) : new C6403p9("getInfoAsync", o5Arr, qt));
            c8444zs0.c().put("readAsStringAsync", new C6403p9("readAsStringAsync", new O5[]{new O5(new C1679Vh0(BP0.a(String.class), false, ST.q)), new O5(new C1679Vh0(BP0.a(ReadingOptions.class), false, ST.r))}, new QT(this, 13)));
            O5[] o5Arr2 = {new O5(new C1679Vh0(BP0.a(String.class), false, ST.s)), new O5(new C1679Vh0(BP0.a(String.class), false, ST.t)), new O5(new C1679Vh0(BP0.a(WritingOptions.class), false, ST.u))};
            QT qt2 = new QT(this, 0);
            c8444zs0.c().put("writeAsStringAsync", O90.a(C1518Tf1.class, cls) ? new C0590Hi("writeAsStringAsync", o5Arr2, qt2, 3) : O90.a(C1518Tf1.class, Boolean.TYPE) ? new C0590Hi("writeAsStringAsync", o5Arr2, qt2, 0) : O90.a(C1518Tf1.class, Double.TYPE) ? new C0590Hi("writeAsStringAsync", o5Arr2, qt2, 1) : O90.a(C1518Tf1.class, Float.TYPE) ? new C0590Hi("writeAsStringAsync", o5Arr2, qt2, 2) : O90.a(C1518Tf1.class, String.class) ? new C0590Hi("writeAsStringAsync", o5Arr2, qt2, 4) : new C6403p9("writeAsStringAsync", o5Arr2, qt2));
            O5[] o5Arr3 = {new O5(new C1679Vh0(BP0.a(String.class), false, X2.C)), new O5(new C1679Vh0(BP0.a(DeletingOptions.class), false, X2.D))};
            QT qt3 = new QT(this, 1);
            c8444zs0.c().put("deleteAsync", O90.a(C1518Tf1.class, cls) ? new C0590Hi("deleteAsync", o5Arr3, qt3, 3) : O90.a(C1518Tf1.class, Boolean.TYPE) ? new C0590Hi("deleteAsync", o5Arr3, qt3, 0) : O90.a(C1518Tf1.class, Double.TYPE) ? new C0590Hi("deleteAsync", o5Arr3, qt3, 1) : O90.a(C1518Tf1.class, Float.TYPE) ? new C0590Hi("deleteAsync", o5Arr3, qt3, 2) : O90.a(C1518Tf1.class, String.class) ? new C0590Hi("deleteAsync", o5Arr3, qt3, 4) : new C6403p9("deleteAsync", o5Arr3, qt3));
            if (O90.a(RelocatingOptions.class, InterfaceC7754wE0.class)) {
                c0590Hi = new C6403p9("moveAsync", new O5[0], new RT(this, 0));
            } else {
                O5[] o5Arr4 = {new O5(new C1679Vh0(BP0.a(RelocatingOptions.class), false, X2.E))};
                QT qt4 = new QT(this, 2);
                c0590Hi = O90.a(C1518Tf1.class, cls) ? new C0590Hi("moveAsync", o5Arr4, qt4, 3) : O90.a(C1518Tf1.class, Boolean.TYPE) ? new C0590Hi("moveAsync", o5Arr4, qt4, 0) : O90.a(C1518Tf1.class, Double.TYPE) ? new C0590Hi("moveAsync", o5Arr4, qt4, 1) : O90.a(C1518Tf1.class, Float.TYPE) ? new C0590Hi("moveAsync", o5Arr4, qt4, 2) : O90.a(C1518Tf1.class, String.class) ? new C0590Hi("moveAsync", o5Arr4, qt4, 4) : new C6403p9("moveAsync", o5Arr4, qt4);
            }
            c8444zs0.c().put("moveAsync", c0590Hi);
            if (O90.a(RelocatingOptions.class, InterfaceC7754wE0.class)) {
                c0590Hi2 = new C6403p9("copyAsync", new O5[0], new RT(this, 1));
            } else {
                O5[] o5Arr5 = {new O5(new C1679Vh0(BP0.a(RelocatingOptions.class), false, X2.F))};
                QT qt5 = new QT(this, 3);
                if (O90.a(Object.class, cls)) {
                    c0590Hi2 = new C0590Hi("copyAsync", o5Arr5, qt5, 3);
                } else {
                    c0590Hi2 = O90.a(Object.class, Boolean.TYPE) ? new C0590Hi("copyAsync", o5Arr5, qt5, 0) : O90.a(Object.class, Double.TYPE) ? new C0590Hi("copyAsync", o5Arr5, qt5, 1) : O90.a(Object.class, Float.TYPE) ? new C0590Hi("copyAsync", o5Arr5, qt5, 2) : O90.a(Object.class, String.class) ? new C0590Hi("copyAsync", o5Arr5, qt5, 4) : new C6403p9("copyAsync", o5Arr5, qt5);
                }
            }
            c8444zs0.c().put("copyAsync", c0590Hi2);
            O5[] o5Arr6 = {new O5(new C1679Vh0(BP0.a(String.class), false, X2.H)), new O5(new C1679Vh0(BP0.a(MakeDirectoryOptions.class), false, X2.I))};
            QT qt6 = new QT(this, 4);
            c8444zs0.c().put("makeDirectoryAsync", O90.a(C1518Tf1.class, cls) ? new C0590Hi("makeDirectoryAsync", o5Arr6, qt6, 3) : O90.a(C1518Tf1.class, Boolean.TYPE) ? new C0590Hi("makeDirectoryAsync", o5Arr6, qt6, 0) : O90.a(C1518Tf1.class, Double.TYPE) ? new C0590Hi("makeDirectoryAsync", o5Arr6, qt6, 1) : O90.a(C1518Tf1.class, Float.TYPE) ? new C0590Hi("makeDirectoryAsync", o5Arr6, qt6, 2) : O90.a(C1518Tf1.class, String.class) ? new C0590Hi("makeDirectoryAsync", o5Arr6, qt6, 4) : new C6403p9("makeDirectoryAsync", o5Arr6, qt6));
            if (O90.a(String.class, InterfaceC7754wE0.class)) {
                c0590Hi3 = new C6403p9("readDirectoryAsync", new O5[0], new RT(this, 2));
            } else {
                O5[] o5Arr7 = {new O5(new C1679Vh0(BP0.a(String.class), true, ST.f))};
                QT qt7 = new QT(this, 5);
                c0590Hi3 = O90.a(List.class, cls) ? new C0590Hi("readDirectoryAsync", o5Arr7, qt7, 3) : O90.a(List.class, Boolean.TYPE) ? new C0590Hi("readDirectoryAsync", o5Arr7, qt7, 0) : O90.a(List.class, Double.TYPE) ? new C0590Hi("readDirectoryAsync", o5Arr7, qt7, 1) : O90.a(List.class, Float.TYPE) ? new C0590Hi("readDirectoryAsync", o5Arr7, qt7, 2) : O90.a(List.class, String.class) ? new C0590Hi("readDirectoryAsync", o5Arr7, qt7, 4) : new C6403p9("readDirectoryAsync", o5Arr7, qt7);
            }
            c8444zs0.c().put("readDirectoryAsync", c0590Hi3);
            O5[] o5Arr8 = new O5[0];
            C1404Rt1 c1404Rt1 = new C1404Rt1(12);
            c8444zs0.c().put("getTotalDiskCapacityAsync", O90.a(Double.class, cls) ? new C0590Hi("getTotalDiskCapacityAsync", o5Arr8, c1404Rt1, 3) : O90.a(Double.class, Boolean.TYPE) ? new C0590Hi("getTotalDiskCapacityAsync", o5Arr8, c1404Rt1, 0) : O90.a(Double.class, Double.TYPE) ? new C0590Hi("getTotalDiskCapacityAsync", o5Arr8, c1404Rt1, 1) : O90.a(Double.class, Float.TYPE) ? new C0590Hi("getTotalDiskCapacityAsync", o5Arr8, c1404Rt1, 2) : O90.a(Double.class, String.class) ? new C0590Hi("getTotalDiskCapacityAsync", o5Arr8, c1404Rt1, 4) : new C6403p9("getTotalDiskCapacityAsync", o5Arr8, c1404Rt1));
            O5[] o5Arr9 = new O5[0];
            C1404Rt1 c1404Rt12 = new C1404Rt1(13);
            c8444zs0.c().put("getFreeDiskStorageAsync", O90.a(Double.class, cls) ? new C0590Hi("getFreeDiskStorageAsync", o5Arr9, c1404Rt12, 3) : O90.a(Double.class, Boolean.TYPE) ? new C0590Hi("getFreeDiskStorageAsync", o5Arr9, c1404Rt12, 0) : O90.a(Double.class, Double.TYPE) ? new C0590Hi("getFreeDiskStorageAsync", o5Arr9, c1404Rt12, 1) : O90.a(Double.class, Float.TYPE) ? new C0590Hi("getFreeDiskStorageAsync", o5Arr9, c1404Rt12, 2) : O90.a(Double.class, String.class) ? new C0590Hi("getFreeDiskStorageAsync", o5Arr9, c1404Rt12, 4) : new C6403p9("getFreeDiskStorageAsync", o5Arr9, c1404Rt12));
            if (O90.a(String.class, InterfaceC7754wE0.class)) {
                c0590Hi4 = new C6403p9("getContentUriAsync", new O5[0], new RT(this, 3));
            } else {
                O5[] o5Arr10 = {new O5(new C1679Vh0(BP0.a(String.class), false, ST.g))};
                QT qt8 = new QT(this, 6);
                c0590Hi4 = O90.a(String.class, cls) ? new C0590Hi("getContentUriAsync", o5Arr10, qt8, 3) : O90.a(String.class, Boolean.TYPE) ? new C0590Hi("getContentUriAsync", o5Arr10, qt8, 0) : O90.a(String.class, Double.TYPE) ? new C0590Hi("getContentUriAsync", o5Arr10, qt8, 1) : O90.a(String.class, Float.TYPE) ? new C0590Hi("getContentUriAsync", o5Arr10, qt8, 2) : O90.a(String.class, String.class) ? new C0590Hi("getContentUriAsync", o5Arr10, qt8, 4) : new C6403p9("getContentUriAsync", o5Arr10, qt8);
            }
            c8444zs0.c().put("getContentUriAsync", c0590Hi4);
            if (O90.a(String.class, InterfaceC7754wE0.class)) {
                c0590Hi5 = new C6403p9("readSAFDirectoryAsync", new O5[0], new RT(this, 4));
            } else {
                O5[] o5Arr11 = {new O5(new C1679Vh0(BP0.a(String.class), false, ST.i))};
                QT qt9 = new QT(this, 7);
                c0590Hi5 = O90.a(List.class, cls) ? new C0590Hi("readSAFDirectoryAsync", o5Arr11, qt9, 3) : O90.a(List.class, Boolean.TYPE) ? new C0590Hi("readSAFDirectoryAsync", o5Arr11, qt9, 0) : O90.a(List.class, Double.TYPE) ? new C0590Hi("readSAFDirectoryAsync", o5Arr11, qt9, 1) : O90.a(List.class, Float.TYPE) ? new C0590Hi("readSAFDirectoryAsync", o5Arr11, qt9, 2) : O90.a(List.class, String.class) ? new C0590Hi("readSAFDirectoryAsync", o5Arr11, qt9, 4) : new C6403p9("readSAFDirectoryAsync", o5Arr11, qt9);
            }
            c8444zs0.c().put("readSAFDirectoryAsync", c0590Hi5);
            O5[] o5Arr12 = {new O5(new C1679Vh0(BP0.a(String.class), false, ST.j)), new O5(new C1679Vh0(BP0.a(String.class), false, ST.k))};
            QT qt10 = new QT(this, 8);
            c8444zs0.c().put("makeSAFDirectoryAsync", O90.a(String.class, cls) ? new C0590Hi("makeSAFDirectoryAsync", o5Arr12, qt10, 3) : O90.a(String.class, Boolean.TYPE) ? new C0590Hi("makeSAFDirectoryAsync", o5Arr12, qt10, 0) : O90.a(String.class, Double.TYPE) ? new C0590Hi("makeSAFDirectoryAsync", o5Arr12, qt10, 1) : O90.a(String.class, Float.TYPE) ? new C0590Hi("makeSAFDirectoryAsync", o5Arr12, qt10, 2) : O90.a(String.class, String.class) ? new C0590Hi("makeSAFDirectoryAsync", o5Arr12, qt10, 4) : new C6403p9("makeSAFDirectoryAsync", o5Arr12, qt10));
            O5[] o5Arr13 = {new O5(new C1679Vh0(BP0.a(String.class), false, ST.l)), new O5(new C1679Vh0(BP0.a(String.class), false, ST.m)), new O5(new C1679Vh0(BP0.a(String.class), false, ST.n))};
            QT qt11 = new QT(this, 10);
            c8444zs0.c().put("createSAFFileAsync", O90.a(String.class, cls) ? new C0590Hi("createSAFFileAsync", o5Arr13, qt11, 3) : O90.a(String.class, Boolean.TYPE) ? new C0590Hi("createSAFFileAsync", o5Arr13, qt11, 0) : O90.a(String.class, Double.TYPE) ? new C0590Hi("createSAFFileAsync", o5Arr13, qt11, 1) : O90.a(String.class, Float.TYPE) ? new C0590Hi("createSAFFileAsync", o5Arr13, qt11, 2) : O90.a(String.class, String.class) ? new C0590Hi("createSAFFileAsync", o5Arr13, qt11, 4) : new C6403p9("createSAFFileAsync", o5Arr13, qt11));
            c8444zs0.c().put("requestDirectoryPermissionsAsync", new C6403p9("requestDirectoryPermissionsAsync", new O5[]{new O5(new C1679Vh0(BP0.a(String.class), true, ST.D))}, new RT(this, 10)));
            c8444zs0.c().put("uploadAsync", new C6403p9("uploadAsync", new O5[]{new O5(new C1679Vh0(BP0.a(String.class), false, ST.F)), new O5(new C1679Vh0(BP0.a(String.class), false, ST.G)), new O5(new C1679Vh0(BP0.a(FileSystemUploadOptions.class), false, ST.H))}, new RT(this, c8444zs0)));
            c8444zs0.c().put("uploadTaskStartAsync", new C6403p9("uploadTaskStartAsync", new O5[]{new O5(new C1679Vh0(BP0.a(String.class), false, ST.I)), new O5(new C1679Vh0(BP0.a(String.class), false, TT.f)), new O5(new C1679Vh0(BP0.a(String.class), false, TT.g)), new O5(new C1679Vh0(BP0.a(FileSystemUploadOptions.class), false, ST.v))}, new RT(this, 7)));
            c8444zs0.c().put("downloadAsync", new C6403p9("downloadAsync", new O5[]{new O5(new C1679Vh0(BP0.a(String.class), false, ST.w)), new O5(new C1679Vh0(BP0.a(String.class), true, ST.x)), new O5(new C1679Vh0(BP0.a(DownloadOptions.class), false, ST.y))}, new RT(this, 8)));
            c8444zs0.c().put("networkTaskCancelAsync", O90.a(String.class, InterfaceC7754wE0.class) ? new C6403p9("networkTaskCancelAsync", new O5[0], new RT(this, 5)) : new C6403p9("networkTaskCancelAsync", new O5[]{new O5(new C1679Vh0(BP0.a(String.class), false, ST.o))}, new QT(this, 11)));
            c8444zs0.c().put("downloadResumableStartAsync", new C6403p9("downloadResumableStartAsync", new O5[]{new O5(new C1679Vh0(BP0.a(String.class), false, ST.z)), new O5(new C1679Vh0(BP0.a(String.class), false, ST.A)), new O5(new C1679Vh0(BP0.a(String.class), false, ST.B)), new O5(new C1679Vh0(BP0.a(DownloadOptions.class), false, ST.C)), new O5(new C1679Vh0(BP0.a(String.class), true, ST.E))}, new RT(this, 9)));
            if (O90.a(String.class, InterfaceC7754wE0.class)) {
                c0590Hi6 = new C6403p9("downloadResumablePauseAsync", new O5[0], new RT(this, 6));
            } else {
                O5[] o5Arr14 = {new O5(new C1679Vh0(BP0.a(String.class), false, ST.p))};
                QT qt12 = new QT(this, 12);
                c0590Hi6 = O90.a(Bundle.class, cls) ? new C0590Hi("downloadResumablePauseAsync", o5Arr14, qt12, 3) : O90.a(Bundle.class, Boolean.TYPE) ? new C0590Hi("downloadResumablePauseAsync", o5Arr14, qt12, 0) : O90.a(Bundle.class, Double.TYPE) ? new C0590Hi("downloadResumablePauseAsync", o5Arr14, qt12, 1) : O90.a(Bundle.class, Float.TYPE) ? new C0590Hi("downloadResumablePauseAsync", o5Arr14, qt12, 2) : O90.a(Bundle.class, String.class) ? new C0590Hi("downloadResumablePauseAsync", o5Arr14, qt12, 4) : new C6403p9("downloadResumablePauseAsync", o5Arr14, qt12);
            }
            c8444zs0.c().put("downloadResumablePauseAsync", c0590Hi6);
            linkedHashMap.put(NP.g, new DP(new RT(this, 12)));
            NP np2 = NP.b;
            linkedHashMap.put(np2, new C1207Pg(np2, new UT(this, 1)));
            C0075As0 c0075As0B = c8444zs0.b();
            Trace.endSection();
            return c0075As0B;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void l(Uri uri, OA0 oa0) throws Exception {
        if (oa0 == OA0.a) {
            m(uri, oa0, F91.u("Location '", uri, "' isn't readable."));
        }
        if (oa0 == OA0.b) {
            m(uri, oa0, F91.u("Location '", uri, "' isn't writable."));
        }
        m(uri, oa0, "Location '" + uri + "' doesn't have permission '" + oa0.name() + "'.");
    }

    public final void m(Uri uri, OA0 oa0, String str) throws Exception {
        EnumSet enumSetOf;
        Object obj;
        boolean zR = r(uri);
        OA0 oa02 = OA0.a;
        if (zR) {
            YZ1 yz1Q = q(uri);
            enumSetOf = EnumSet.noneOf(OA0.class);
            if (yz1Q.a()) {
                enumSetOf.add(oa02);
            }
            if (yz1Q.b()) {
                enumSetOf.add(OA0.b);
            }
            O90.e(enumSetOf, "apply(...)");
        } else if (O90.a(uri.getScheme(), RemoteMessageConst.Notification.CONTENT) || O90.a(uri.getScheme(), "asset")) {
            enumSetOf = EnumSet.of(oa02);
        } else if (O90.a(uri.getScheme(), "file")) {
            String path = uri.getPath();
            try {
                obj = b().a.a.get(CT.class);
            } catch (Exception unused) {
                obj = null;
            }
            enumSetOf = ((CT) obj) != null ? CT.c(o(), path) : null;
        } else {
            enumSetOf = uri.getScheme() == null ? EnumSet.of(oa02) : EnumSet.noneOf(OA0.class);
        }
        if (enumSetOf == null || !enumSetOf.contains(oa0)) {
            throw new IOException(str);
        }
    }

    public final Context o() throws C7143t2 {
        Context contextC = b().c();
        if (contextC != null) {
            return contextC;
        }
        throw new C7143t2(6);
    }

    public final YZ1 q(Uri uri) throws Exception {
        Context contextO = o();
        C5232j11 c5232j11 = new C5232j11();
        c5232j11.b = contextO;
        c5232j11.c = uri;
        String strF = AbstractC2051a02.f(contextO, uri, "mime_type");
        return ("vnd.android.document/directory".equals(strF) || TextUtils.isEmpty(strF)) ? new C5232j11(o(), DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri))) : c5232j11;
    }

    public final InputStream s(Uri uri) throws IOException {
        String path = uri.getPath();
        if (path == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String strSubstring = path.substring(1);
        O90.e(strSubstring, "substring(...)");
        InputStream inputStreamOpen = o().getAssets().open(strSubstring);
        O90.e(inputStreamOpen, "open(...)");
        return inputStreamOpen;
    }

    public final void u(YZ1 yz1, File file, boolean z) throws IOException {
        if (!yz1.f()) {
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
        if (yz1.i()) {
            YZ1[] yz1ArrJ = yz1.j();
            O90.e(yz1ArrJ, "listFiles(...)");
            for (YZ1 yz12 : yz1ArrJ) {
                O90.c(yz12);
                u(yz12, file, z);
            }
            if (z) {
                return;
            }
            yz1.e();
            return;
        }
        String strG = yz1.g();
        if (strG == null) {
            return;
        }
        File file2 = file.isDirectory() ? new File(file.getPath(), strG) : new File(file.getPath());
        InputStream inputStreamOpenInputStream = o().getContentResolver().openInputStream(yz1.h());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                AbstractC3325d50.a(inputStreamOpenInputStream, fileOutputStream);
                AbstractC2141aT1.a(fileOutputStream, null);
                AbstractC2141aT1.a(inputStreamOpenInputStream, null);
                if (z) {
                    return;
                }
                yz1.e();
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC2141aT1.a(inputStreamOpenInputStream, th);
                throw th2;
            }
        }
    }
}
