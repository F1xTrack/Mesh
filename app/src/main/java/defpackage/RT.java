package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.DocumentsContract;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.rn.push.constants.Core;
import expo.modules.filesystem.DownloadOptions;
import expo.modules.filesystem.FileSystemUploadOptions;
import expo.modules.filesystem.RelocatingOptions;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class RT extends AbstractC1676Vg0 implements Function2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ WT f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RT(WT wt, int i) {
        super(2);
        this.e = i;
        this.f = wt;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6363ox0 c6363ox0;
        Uri uri;
        C1518Tf1 c1518Tf1;
        Intent intent;
        switch (this.e) {
            case 0:
                Object obj3 = (InterfaceC7754wE0) obj2;
                O90.f((Object[]) obj, "<anonymous parameter 0>");
                O90.f(obj3, BaseJavaModule.METHOD_TYPE_PROMISE);
                RelocatingOptions relocatingOptions = (RelocatingOptions) obj3;
                Uri uri2 = Uri.parse(XT.a(relocatingOptions.getFrom()));
                Uri uriWithAppendedPath = Uri.withAppendedPath(uri2, "..");
                O90.e(uriWithAppendedPath, "withAppendedPath(...)");
                OA0 oa0 = OA0.b;
                String strU = F91.u("Location '", uri2, "' isn't movable.");
                WT wt = this.f;
                wt.m(uriWithAppendedPath, oa0, strU);
                Uri uri3 = Uri.parse(XT.a(relocatingOptions.getTo()));
                O90.c(uri3);
                wt.l(uri3, oa0);
                if (!O90.a(uri2.getScheme(), "file")) {
                    if (!WT.r(uri2)) {
                        throw new IOException(F91.u("Unsupported scheme for location '", uri2, "'."));
                    }
                    YZ1 yz1Q = wt.q(uri2);
                    if (!yz1Q.f()) {
                        throw new C7143t2(uri2, uri3);
                    }
                    wt.u(yz1Q, WT.t(uri3), false);
                } else if (!WT.t(uri2).renameTo(WT.t(uri3))) {
                    throw new C7143t2(uri2, uri3);
                }
                return C1518Tf1.a;
            case 1:
                Object obj4 = (InterfaceC7754wE0) obj2;
                O90.f((Object[]) obj, "<anonymous parameter 0>");
                O90.f(obj4, BaseJavaModule.METHOD_TYPE_PROMISE);
                RelocatingOptions relocatingOptions2 = (RelocatingOptions) obj4;
                Uri uri4 = Uri.parse(XT.a(relocatingOptions2.getFrom()));
                O90.c(uri4);
                OA0 oa02 = OA0.a;
                String strU2 = F91.u("Location '", uri4, "' isn't readable.");
                WT wt2 = this.f;
                wt2.m(uri4, oa02, strU2);
                Uri uri5 = Uri.parse(XT.a(relocatingOptions2.getTo()));
                O90.c(uri5);
                wt2.l(uri5, OA0.b);
                if (O90.a(uri4.getScheme(), "file")) {
                    File fileT = WT.t(uri4);
                    File fileT2 = WT.t(uri5);
                    if (fileT.isDirectory()) {
                        AbstractC5320jU.b(fileT, fileT2);
                    } else {
                        AbstractC5320jU.c(fileT, fileT2);
                    }
                } else if (WT.r(uri4)) {
                    YZ1 yz1Q2 = wt2.q(uri4);
                    if (!yz1Q2.f()) {
                        throw new C7143t2(uri4, 18);
                    }
                    wt2.u(yz1Q2, WT.t(uri5), true);
                } else if (O90.a(uri4.getScheme(), RemoteMessageConst.Notification.CONTENT)) {
                    AbstractC3325d50.a(wt2.o().getContentResolver().openInputStream(uri4), new FileOutputStream(WT.t(uri5)));
                } else if (O90.a(uri4.getScheme(), "asset")) {
                    AbstractC3325d50.a(wt2.s(uri4), new FileOutputStream(WT.t(uri5)));
                } else {
                    if (uri4.getScheme() != null) {
                        throw new IOException(F91.u("Unsupported scheme for location '", uri4, "'."));
                    }
                    AbstractC3325d50.a(WT.j(wt2, relocatingOptions2.getFrom()), new FileOutputStream(WT.t(uri5)));
                }
                return C1518Tf1.a;
            case 2:
                Object obj5 = (InterfaceC7754wE0) obj2;
                O90.f((Object[]) obj, "<anonymous parameter 0>");
                O90.f(obj5, BaseJavaModule.METHOD_TYPE_PROMISE);
                Uri uri6 = Uri.parse(XT.a((String) obj5));
                O90.c(uri6);
                this.f.l(uri6, OA0.a);
                if (!O90.a(uri6.getScheme(), "file")) {
                    if (WT.r(uri6)) {
                        throw new C7143t2(23);
                    }
                    throw new IOException(F91.u("Unsupported scheme for location '", uri6, "'."));
                }
                File[] fileArrListFiles = WT.t(uri6).listFiles();
                if (fileArrListFiles == null) {
                    throw new C7143t2(uri6, 17);
                }
                ArrayList arrayList = new ArrayList(fileArrListFiles.length);
                int length = fileArrListFiles.length;
                for (int i = 0; i < length; i++) {
                    File file = fileArrListFiles[i];
                    arrayList.add(file != null ? file.getName() : null);
                }
                return C1518Tf1.a;
            case 3:
                Object obj6 = (InterfaceC7754wE0) obj2;
                O90.f((Object[]) obj, "<anonymous parameter 0>");
                O90.f(obj6, BaseJavaModule.METHOD_TYPE_PROMISE);
                String str = (String) obj6;
                Uri uri7 = Uri.parse(XT.a(str));
                O90.c(uri7);
                OA0 oa03 = OA0.b;
                WT wt3 = this.f;
                wt3.l(uri7, oa03);
                wt3.l(uri7, OA0.a);
                WT.d(wt3, uri7);
                if (!O90.a(uri7.getScheme(), "file")) {
                    throw new C7143t2(str, 22);
                }
                WT.e(wt3, WT.t(uri7)).toString();
                return C1518Tf1.a;
            case 4:
                Object obj7 = (InterfaceC7754wE0) obj2;
                O90.f((Object[]) obj, "<anonymous parameter 0>");
                O90.f(obj7, BaseJavaModule.METHOD_TYPE_PROMISE);
                Uri uri8 = Uri.parse(XT.a((String) obj7));
                O90.c(uri8);
                OA0 oa04 = OA0.a;
                WT wt4 = this.f;
                wt4.l(uri8, oa04);
                if (!WT.r(uri8)) {
                    throw new IOException(F91.u("The URI '", uri8, "' is not a Storage Access Framework URI. Try using FileSystem.readDirectoryAsync instead."));
                }
                C5232j11 c5232j11 = new C5232j11(wt4.o(), DocumentsContract.buildDocumentUriUsingTree(uri8, DocumentsContract.getTreeDocumentId(uri8)));
                if (!c5232j11.f() || !c5232j11.i()) {
                    throw new C7143t2(uri8, 17);
                }
                YZ1[] yz1ArrJ = c5232j11.j();
                ArrayList arrayList2 = new ArrayList(yz1ArrJ.length);
                for (YZ1 yz1 : yz1ArrJ) {
                    arrayList2.add(yz1.h().toString());
                }
                return C1518Tf1.a;
            case 5:
                Object obj8 = (InterfaceC7754wE0) obj2;
                O90.f((Object[]) obj, "<anonymous parameter 0>");
                O90.f(obj8, BaseJavaModule.METHOD_TYPE_PROMISE);
                LT lt = (LT) this.f.e.get((String) obj8);
                if (lt != null) {
                    lt.a.e();
                }
                return C1518Tf1.a;
            case 6:
                Object obj9 = (InterfaceC7754wE0) obj2;
                O90.f((Object[]) obj, "<anonymous parameter 0>");
                O90.f(obj9, BaseJavaModule.METHOD_TYPE_PROMISE);
                String str2 = (String) obj9;
                WT wt5 = this.f;
                LT lt2 = (LT) wt5.e.get(str2);
                if (lt2 == null) {
                    throw new IOException("No download object available");
                }
                if (!(lt2 instanceof JT)) {
                    throw new C7143t2(15);
                }
                lt2.a.e();
                wt5.e.remove(str2);
                new Bundle().putString("resumeData", String.valueOf(WT.t(((JT) lt2).b).length()));
                return C1518Tf1.a;
            case 7:
                Object[] objArr = (Object[]) obj;
                InterfaceC7754wE0 interfaceC7754wE0 = (InterfaceC7754wE0) obj2;
                O90.f(objArr, "<name for destructuring parameter 0>");
                O90.f(interfaceC7754wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
                Object obj10 = objArr[0];
                Object obj11 = objArr[1];
                Object obj12 = objArr[2];
                FileSystemUploadOptions fileSystemUploadOptions = (FileSystemUploadOptions) objArr[3];
                String str3 = (String) obj12;
                WT wt6 = this.f;
                C6649qR0 c6649qR0F = WT.f(wt6, (String) obj10, (String) obj11, fileSystemUploadOptions, new C3513e41(16, new NT(wt6, str3)));
                C6363ox0 c6363ox0H = WT.h(wt6);
                O90.c(c6363ox0H);
                DN0 dn0B = c6363ox0H.b(c6649qR0F);
                wt6.e.put(str3, new LT(dn0B));
                FirebasePerfOkHttpClient.enqueue(dn0B, new CC0(interfaceC7754wE0, 14, wt6));
                return C1518Tf1.a;
            case 8:
                Object[] objArr2 = (Object[]) obj;
                InterfaceC7754wE0 interfaceC7754wE02 = (InterfaceC7754wE0) obj2;
                O90.f(objArr2, "<name for destructuring parameter 0>");
                O90.f(interfaceC7754wE02, BaseJavaModule.METHOD_TYPE_PROMISE);
                Object obj13 = objArr2[0];
                Object obj14 = objArr2[1];
                DownloadOptions downloadOptions = (DownloadOptions) objArr2[2];
                String str4 = (String) obj13;
                Uri uri9 = Uri.parse(XT.a((String) obj14));
                O90.c(uri9);
                OA0 oa05 = OA0.b;
                WT wt7 = this.f;
                wt7.l(uri9, oa05);
                WT.d(wt7, uri9);
                boolean zP = AbstractC7538v51.p(str4, StringUtils.PROCESS_POSTFIX_DELIMITER, false);
                Object obj15 = C1518Tf1.a;
                if (!zP) {
                    Context contextO = wt7.o();
                    InputStream inputStreamOpenRawResource = contextO.getResources().openRawResource(contextO.getResources().getIdentifier(str4, Core.RAW, contextO.getPackageName()));
                    O90.e(inputStreamOpenRawResource, "openRawResource(...)");
                    C8351zN0 c8351zN0B = JI1.b(JI1.g(inputStreamOpenRawResource));
                    File fileT3 = WT.t(uri9);
                    fileT3.delete();
                    C8161yN0 c8161yN0A = JI1.a(JI1.f(fileT3));
                    c8161yN0A.i(c8351zN0B);
                    c8161yN0A.close();
                    Bundle bundle = new Bundle();
                    bundle.putString("uri", Uri.fromFile(fileT3).toString());
                    boolean md5 = downloadOptions.getMd5();
                    if ((md5 ? Boolean.valueOf(md5) : null) != null) {
                        bundle.putString("md5", WT.i(wt7, fileT3));
                    }
                    interfaceC7754wE02.resolve(bundle);
                } else {
                    if (!"file".equals(uri9.getScheme())) {
                        throw new IOException(F91.u("Unsupported scheme for location '", uri9, "'."));
                    }
                    C7375uF c7375uF = new C7375uF(9, false);
                    c7375uF.G(str4);
                    if (downloadOptions.getHeaders() != null) {
                        for (Map.Entry<String, String> entry : downloadOptions.getHeaders().entrySet()) {
                            c7375uF.k(entry.getKey(), entry.getValue());
                        }
                    }
                    C6363ox0 c6363ox0H2 = WT.h(wt7);
                    if (c6363ox0H2 != null) {
                        FirebasePerfOkHttpClient.enqueue(c6363ox0H2.b(c7375uF.o()), new T71(interfaceC7754wE02, wt7, uri9, downloadOptions));
                        obj = obj15;
                    }
                    if (obj == null) {
                        interfaceC7754wE02.f(new C7143t2(20));
                    }
                }
                return obj15;
            case 9:
                Object[] objArr3 = (Object[]) obj;
                InterfaceC7754wE0 interfaceC7754wE03 = (InterfaceC7754wE0) obj2;
                O90.f(objArr3, "<name for destructuring parameter 0>");
                O90.f(interfaceC7754wE03, BaseJavaModule.METHOD_TYPE_PROMISE);
                Object obj16 = objArr3[0];
                Object obj17 = objArr3[1];
                Object obj18 = objArr3[2];
                Object obj19 = objArr3[3];
                String str5 = (String) objArr3[4];
                DownloadOptions downloadOptions2 = (DownloadOptions) obj19;
                String str6 = (String) obj18;
                String str7 = (String) obj16;
                Uri uri10 = Uri.parse(XT.a((String) obj17));
                O90.c(uri10);
                WT wt8 = this.f;
                WT.d(wt8, uri10);
                if (!O90.a(uri10.getScheme(), "file")) {
                    throw new IOException(F91.u("Unsupported scheme for location '", uri10, "'."));
                }
                PT pt = new PT(str5, str6, wt8);
                C6363ox0 c6363ox0H3 = WT.h(wt8);
                if (c6363ox0H3 != null) {
                    C6172nx0 c6172nx0A = c6363ox0H3.a();
                    c6172nx0A.c.add(new C4022gl(3, pt));
                    c6363ox0 = new C6363ox0(c6172nx0A);
                } else {
                    c6363ox0 = null;
                }
                if (c6363ox0 == null) {
                    interfaceC7754wE03.f(new C7143t2(20));
                } else {
                    C7375uF c7375uF2 = new C7375uF(9, false);
                    if (str5 != null) {
                        c7375uF2.k("Range", "bytes=" + str5 + "-");
                    }
                    if (downloadOptions2.getHeaders() != null) {
                        for (Map.Entry<String, String> entry2 : downloadOptions2.getHeaders().entrySet()) {
                            c7375uF2.k(entry2.getKey(), entry2.getValue());
                        }
                    }
                    c7375uF2.G(str7);
                    DN0 dn0B2 = c6363ox0.b(c7375uF2.o());
                    wt8.e.put(str6, new JT(uri10, dn0B2));
                    AbstractC3767fP1.b(wt8.f, null, new OT(null, new IT(downloadOptions2, dn0B2, WT.t(uri10), str5 != null, interfaceC7754wE03), wt8), 3);
                }
                return C1518Tf1.a;
            case 10:
                Object[] objArr4 = (Object[]) obj;
                InterfaceC7754wE0 interfaceC7754wE04 = (InterfaceC7754wE0) obj2;
                O90.f(objArr4, "<name for destructuring parameter 0>");
                O90.f(interfaceC7754wE04, BaseJavaModule.METHOD_TYPE_PROMISE);
                String str8 = (String) objArr4[0];
                WT wt9 = this.f;
                Activity activityA = wt9.b().a();
                if (activityA == null) {
                    throw new C7143t2(8);
                }
                if (wt9.d != null) {
                    throw new C7143t2(21);
                }
                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                if (Build.VERSION.SDK_INT >= 26 && str8 != null && (uri = Uri.parse(XT.a(str8))) != null) {
                    intent2.putExtra("android.provider.extra.INITIAL_URI", uri);
                }
                wt9.d = interfaceC7754wE04;
                activityA.startActivityForResult(intent2, 5394);
                return C1518Tf1.a;
            case 11:
                Object[] objArr5 = (Object[]) obj;
                InterfaceC7754wE0 interfaceC7754wE05 = (InterfaceC7754wE0) obj2;
                O90.f(objArr5, "<name for destructuring parameter 0>");
                O90.f(interfaceC7754wE05, BaseJavaModule.METHOD_TYPE_PROMISE);
                Object obj20 = objArr5[0];
                Object obj21 = objArr5[1];
                FileSystemUploadOptions fileSystemUploadOptions2 = (FileSystemUploadOptions) objArr5[2];
                C6518pl0 c6518pl0 = C6518pl0.d;
                WT wt10 = this.f;
                C6649qR0 c6649qR0F2 = WT.f(wt10, (String) obj20, (String) obj21, fileSystemUploadOptions2, c6518pl0);
                C6363ox0 c6363ox0H4 = WT.h(wt10);
                C1518Tf1 c1518Tf12 = C1518Tf1.a;
                if (c6363ox0H4 != null) {
                    FirebasePerfOkHttpClient.enqueue(c6363ox0H4.b(c6649qR0F2), new VH(interfaceC7754wE05, wt10, false, 11));
                    c1518Tf1 = c1518Tf12;
                } else {
                    c1518Tf1 = null;
                }
                if (c1518Tf1 == null) {
                    interfaceC7754wE05.f(new C7143t2(20));
                }
                return c1518Tf12;
            default:
                C0168Bx0 c0168Bx0 = (C0168Bx0) obj2;
                O90.f((Activity) obj, "sender");
                O90.f(c0168Bx0, "payload");
                if (c0168Bx0.a == 5394) {
                    WT wt11 = this.f;
                    if (wt11.d != null) {
                        Activity activityA2 = wt11.b().a();
                        if (activityA2 == null) {
                            throw new C7143t2(8);
                        }
                        Bundle bundle2 = new Bundle();
                        if (c0168Bx0.b != -1 || (intent = c0168Bx0.c) == null) {
                            bundle2.putBoolean("granted", false);
                        } else {
                            Uri data = intent.getData();
                            int flags = intent.getFlags() & 3;
                            if (data != null) {
                                activityA2.getContentResolver().takePersistableUriPermission(data, flags);
                            }
                            bundle2.putBoolean("granted", true);
                            bundle2.putString("directoryUri", String.valueOf(data));
                        }
                        InterfaceC7754wE0 interfaceC7754wE06 = wt11.d;
                        if (interfaceC7754wE06 != null) {
                            interfaceC7754wE06.resolve(bundle2);
                        }
                        wt11.d = null;
                    }
                }
                return C1518Tf1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RT(WT wt, C8444zs0 c8444zs0) {
        super(2);
        this.e = 11;
        this.f = wt;
    }
}
