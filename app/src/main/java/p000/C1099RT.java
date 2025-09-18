package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.DocumentsContract;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huawei.hms.p015rn.push.constants.Core;
import com.huawei.hms.push.constant.RemoteMessageConst;
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

/* renamed from: RT */
/* loaded from: classes2.dex */
public final class C1099RT extends AbstractC8418Vg0 implements Function2 {

    /* renamed from: e */
    public final /* synthetic */ int f10187e;

    /* renamed from: f */
    public final /* synthetic */ C1414WT f10188f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1099RT(C1414WT c1414wt, int i) {
        super(2);
        this.f10187e = i;
        this.f10188f = c1414wt;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C10585ox0 c10585ox0;
        Uri uri;
        C8313Tf1 c8313Tf1;
        Intent intent;
        switch (this.f10187e) {
            case 0:
                Object obj3 = (InterfaceC11518wE0) obj2;
                O90.m5968f((Object[]) obj, "<anonymous parameter 0>");
                O90.m5968f(obj3, BaseJavaModule.METHOD_TYPE_PROMISE);
                RelocatingOptions relocatingOptions = (RelocatingOptions) obj3;
                Uri uri2 = Uri.parse(AbstractC1477XT.m9053a(relocatingOptions.getFrom()));
                Uri uriWithAppendedPath = Uri.withAppendedPath(uri2, "..");
                O90.m5967e(uriWithAppendedPath, "withAppendedPath(...)");
                OA0 oa0 = OA0.f8265b;
                String strM2538u = F91.m2538u("Location '", uri2, "' isn't movable.");
                C1414WT c1414wt = this.f10188f;
                c1414wt.m8777m(uriWithAppendedPath, oa0, strM2538u);
                Uri uri3 = Uri.parse(AbstractC1477XT.m9053a(relocatingOptions.getTo()));
                O90.m5965c(uri3);
                c1414wt.m8776l(uri3, oa0);
                if (!O90.m5963a(uri2.getScheme(), "file")) {
                    if (!C1414WT.m8774r(uri2)) {
                        throw new IOException(F91.m2538u("Unsupported scheme for location '", uri2, "'."));
                    }
                    YZ1 yz1M8779q = c1414wt.m8779q(uri2);
                    if (!yz1M8779q.mo9317f()) {
                        throw new C6861t2(uri2, uri3);
                    }
                    c1414wt.m8781u(yz1M8779q, C1414WT.m8775t(uri3), false);
                } else if (!C1414WT.m8775t(uri2).renameTo(C1414WT.m8775t(uri3))) {
                    throw new C6861t2(uri2, uri3);
                }
                return C8313Tf1.f11463a;
            case 1:
                Object obj4 = (InterfaceC11518wE0) obj2;
                O90.m5968f((Object[]) obj, "<anonymous parameter 0>");
                O90.m5968f(obj4, BaseJavaModule.METHOD_TYPE_PROMISE);
                RelocatingOptions relocatingOptions2 = (RelocatingOptions) obj4;
                Uri uri4 = Uri.parse(AbstractC1477XT.m9053a(relocatingOptions2.getFrom()));
                O90.m5965c(uri4);
                OA0 oa02 = OA0.f8264a;
                String strM2538u2 = F91.m2538u("Location '", uri4, "' isn't readable.");
                C1414WT c1414wt2 = this.f10188f;
                c1414wt2.m8777m(uri4, oa02, strM2538u2);
                Uri uri5 = Uri.parse(AbstractC1477XT.m9053a(relocatingOptions2.getTo()));
                O90.m5965c(uri5);
                c1414wt2.m8776l(uri5, OA0.f8265b);
                if (O90.m5963a(uri4.getScheme(), "file")) {
                    File fileM8775t = C1414WT.m8775t(uri4);
                    File fileM8775t2 = C1414WT.m8775t(uri5);
                    if (fileM8775t.isDirectory()) {
                        AbstractC6240jU.m22046b(fileM8775t, fileM8775t2);
                    } else {
                        AbstractC6240jU.m22047c(fileM8775t, fileM8775t2);
                    }
                } else if (C1414WT.m8774r(uri4)) {
                    YZ1 yz1M8779q2 = c1414wt2.m8779q(uri4);
                    if (!yz1M8779q2.mo9317f()) {
                        throw new C6861t2(uri4, 18);
                    }
                    c1414wt2.m8781u(yz1M8779q2, C1414WT.m8775t(uri5), true);
                } else if (O90.m5963a(uri4.getScheme(), RemoteMessageConst.Notification.CONTENT)) {
                    AbstractC9069d50.m17491a(c1414wt2.m8778o().getContentResolver().openInputStream(uri4), new FileOutputStream(C1414WT.m8775t(uri5)));
                } else if (O90.m5963a(uri4.getScheme(), "asset")) {
                    AbstractC9069d50.m17491a(c1414wt2.m8780s(uri4), new FileOutputStream(C1414WT.m8775t(uri5)));
                } else {
                    if (uri4.getScheme() != null) {
                        throw new IOException(F91.m2538u("Unsupported scheme for location '", uri4, "'."));
                    }
                    AbstractC9069d50.m17491a(C1414WT.m8770j(c1414wt2, relocatingOptions2.getFrom()), new FileOutputStream(C1414WT.m8775t(uri5)));
                }
                return C8313Tf1.f11463a;
            case 2:
                Object obj5 = (InterfaceC11518wE0) obj2;
                O90.m5968f((Object[]) obj, "<anonymous parameter 0>");
                O90.m5968f(obj5, BaseJavaModule.METHOD_TYPE_PROMISE);
                Uri uri6 = Uri.parse(AbstractC1477XT.m9053a((String) obj5));
                O90.m5965c(uri6);
                this.f10188f.m8776l(uri6, OA0.f8264a);
                if (!O90.m5963a(uri6.getScheme(), "file")) {
                    if (C1414WT.m8774r(uri6)) {
                        throw new C6861t2(23);
                    }
                    throw new IOException(F91.m2538u("Unsupported scheme for location '", uri6, "'."));
                }
                File[] fileArrListFiles = C1414WT.m8775t(uri6).listFiles();
                if (fileArrListFiles == null) {
                    throw new C6861t2(uri6, 17);
                }
                ArrayList arrayList = new ArrayList(fileArrListFiles.length);
                int length = fileArrListFiles.length;
                for (int i = 0; i < length; i++) {
                    File file = fileArrListFiles[i];
                    arrayList.add(file != null ? file.getName() : null);
                }
                return C8313Tf1.f11463a;
            case 3:
                Object obj6 = (InterfaceC11518wE0) obj2;
                O90.m5968f((Object[]) obj, "<anonymous parameter 0>");
                O90.m5968f(obj6, BaseJavaModule.METHOD_TYPE_PROMISE);
                String str = (String) obj6;
                Uri uri7 = Uri.parse(AbstractC1477XT.m9053a(str));
                O90.m5965c(uri7);
                OA0 oa03 = OA0.f8265b;
                C1414WT c1414wt3 = this.f10188f;
                c1414wt3.m8776l(uri7, oa03);
                c1414wt3.m8776l(uri7, OA0.f8264a);
                C1414WT.m8764d(c1414wt3, uri7);
                if (!O90.m5963a(uri7.getScheme(), "file")) {
                    throw new C6861t2(str, 22);
                }
                C1414WT.m8765e(c1414wt3, C1414WT.m8775t(uri7)).toString();
                return C8313Tf1.f11463a;
            case 4:
                Object obj7 = (InterfaceC11518wE0) obj2;
                O90.m5968f((Object[]) obj, "<anonymous parameter 0>");
                O90.m5968f(obj7, BaseJavaModule.METHOD_TYPE_PROMISE);
                Uri uri8 = Uri.parse(AbstractC1477XT.m9053a((String) obj7));
                O90.m5965c(uri8);
                OA0 oa04 = OA0.f8264a;
                C1414WT c1414wt4 = this.f10188f;
                c1414wt4.m8776l(uri8, oa04);
                if (!C1414WT.m8774r(uri8)) {
                    throw new IOException(F91.m2538u("The URI '", uri8, "' is not a Storage Access Framework URI. Try using FileSystem.readDirectoryAsync instead."));
                }
                C9827j11 c9827j11 = new C9827j11(c1414wt4.m8778o(), DocumentsContract.buildDocumentUriUsingTree(uri8, DocumentsContract.getTreeDocumentId(uri8)));
                if (!c9827j11.mo9317f() || !c9827j11.mo9320i()) {
                    throw new C6861t2(uri8, 17);
                }
                YZ1[] yz1ArrMo9321j = c9827j11.mo9321j();
                ArrayList arrayList2 = new ArrayList(yz1ArrMo9321j.length);
                for (YZ1 yz1 : yz1ArrMo9321j) {
                    arrayList2.add(yz1.mo9319h().toString());
                }
                return C8313Tf1.f11463a;
            case 5:
                Object obj8 = (InterfaceC11518wE0) obj2;
                O90.m5968f((Object[]) obj, "<anonymous parameter 0>");
                O90.m5968f(obj8, BaseJavaModule.METHOD_TYPE_PROMISE);
                C0722LT c0722lt = (C0722LT) this.f10188f.f13196e.get((String) obj8);
                if (c0722lt != null) {
                    c0722lt.f6636a.m1668e();
                }
                return C8313Tf1.f11463a;
            case 6:
                Object obj9 = (InterfaceC11518wE0) obj2;
                O90.m5968f((Object[]) obj, "<anonymous parameter 0>");
                O90.m5968f(obj9, BaseJavaModule.METHOD_TYPE_PROMISE);
                String str2 = (String) obj9;
                C1414WT c1414wt5 = this.f10188f;
                C0722LT c0722lt2 = (C0722LT) c1414wt5.f13196e.get(str2);
                if (c0722lt2 == null) {
                    throw new IOException("No download object available");
                }
                if (!(c0722lt2 instanceof C0597JT)) {
                    throw new C6861t2(15);
                }
                c0722lt2.f6636a.m1668e();
                c1414wt5.f13196e.remove(str2);
                new Bundle().putString("resumeData", String.valueOf(C1414WT.m8775t(((C0597JT) c0722lt2).f5527b).length()));
                return C8313Tf1.f11463a;
            case 7:
                Object[] objArr = (Object[]) obj;
                InterfaceC11518wE0 interfaceC11518wE0 = (InterfaceC11518wE0) obj2;
                O90.m5968f(objArr, "<name for destructuring parameter 0>");
                O90.m5968f(interfaceC11518wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
                Object obj10 = objArr[0];
                Object obj11 = objArr[1];
                Object obj12 = objArr[2];
                FileSystemUploadOptions fileSystemUploadOptions = (FileSystemUploadOptions) objArr[3];
                String str3 = (String) obj12;
                C1414WT c1414wt6 = this.f10188f;
                C10777qR0 c10777qR0M8766f = C1414WT.m8766f(c1414wt6, (String) obj10, (String) obj11, fileSystemUploadOptions, new C9196e41(16, new C0848NT(c1414wt6, str3)));
                C10585ox0 c10585ox0M8768h = C1414WT.m8768h(c1414wt6);
                O90.m5965c(c10585ox0M8768h);
                DN0 dn0M23580b = c10585ox0M8768h.m23580b(c10777qR0M8766f);
                c1414wt6.f13196e.put(str3, new C0722LT(dn0M23580b));
                FirebasePerfOkHttpClient.enqueue(dn0M23580b, new CC0(interfaceC11518wE0, 14, c1414wt6));
                return C8313Tf1.f11463a;
            case 8:
                Object[] objArr2 = (Object[]) obj;
                InterfaceC11518wE0 interfaceC11518wE02 = (InterfaceC11518wE0) obj2;
                O90.m5968f(objArr2, "<name for destructuring parameter 0>");
                O90.m5968f(interfaceC11518wE02, BaseJavaModule.METHOD_TYPE_PROMISE);
                Object obj13 = objArr2[0];
                Object obj14 = objArr2[1];
                DownloadOptions downloadOptions = (DownloadOptions) objArr2[2];
                String str4 = (String) obj13;
                Uri uri9 = Uri.parse(AbstractC1477XT.m9053a((String) obj14));
                O90.m5965c(uri9);
                OA0 oa05 = OA0.f8265b;
                C1414WT c1414wt7 = this.f10188f;
                c1414wt7.m8776l(uri9, oa05);
                C1414WT.m8764d(c1414wt7, uri9);
                boolean zM25351p = AbstractC11374v51.m25351p(str4, StringUtils.PROCESS_POSTFIX_DELIMITER, false);
                Object obj15 = C8313Tf1.f11463a;
                if (!zM25351p) {
                    Context contextM8778o = c1414wt7.m8778o();
                    InputStream inputStreamOpenRawResource = contextM8778o.getResources().openRawResource(contextM8778o.getResources().getIdentifier(str4, Core.RAW, contextM8778o.getPackageName()));
                    O90.m5967e(inputStreamOpenRawResource, "openRawResource(...)");
                    C11917zN0 c11917zN0M4274b = JI1.m4274b(JI1.m4279g(inputStreamOpenRawResource));
                    File fileM8775t3 = C1414WT.m8775t(uri9);
                    fileM8775t3.delete();
                    C11790yN0 c11790yN0M4273a = JI1.m4273a(JI1.m4278f(fileM8775t3));
                    c11790yN0M4273a.mo4396i(c11917zN0M4274b);
                    c11790yN0M4273a.close();
                    Bundle bundle = new Bundle();
                    bundle.putString("uri", Uri.fromFile(fileM8775t3).toString());
                    boolean md5 = downloadOptions.getMd5();
                    if ((md5 ? Boolean.valueOf(md5) : null) != null) {
                        bundle.putString("md5", C1414WT.m8769i(c1414wt7, fileM8775t3));
                    }
                    interfaceC11518wE02.resolve(bundle);
                } else {
                    if (!"file".equals(uri9.getScheme())) {
                        throw new IOException(F91.m2538u("Unsupported scheme for location '", uri9, "'."));
                    }
                    C6937uF c6937uF = new C6937uF(9, false);
                    c6937uF.m25136G(str4);
                    if (downloadOptions.getHeaders() != null) {
                        for (Map.Entry<String, String> entry : downloadOptions.getHeaders().entrySet()) {
                            c6937uF.m25139k(entry.getKey(), entry.getValue());
                        }
                    }
                    C10585ox0 c10585ox0M8768h2 = C1414WT.m8768h(c1414wt7);
                    if (c10585ox0M8768h2 != null) {
                        FirebasePerfOkHttpClient.enqueue(c10585ox0M8768h2.m23580b(c6937uF.m25141o()), new T71(interfaceC11518wE02, c1414wt7, uri9, downloadOptions));
                        obj = obj15;
                    }
                    if (obj == null) {
                        interfaceC11518wE02.mo8108f(new C6861t2(20));
                    }
                }
                return obj15;
            case 9:
                Object[] objArr3 = (Object[]) obj;
                InterfaceC11518wE0 interfaceC11518wE03 = (InterfaceC11518wE0) obj2;
                O90.m5968f(objArr3, "<name for destructuring parameter 0>");
                O90.m5968f(interfaceC11518wE03, BaseJavaModule.METHOD_TYPE_PROMISE);
                Object obj16 = objArr3[0];
                Object obj17 = objArr3[1];
                Object obj18 = objArr3[2];
                Object obj19 = objArr3[3];
                String str5 = (String) objArr3[4];
                DownloadOptions downloadOptions2 = (DownloadOptions) obj19;
                String str6 = (String) obj18;
                String str7 = (String) obj16;
                Uri uri10 = Uri.parse(AbstractC1477XT.m9053a((String) obj17));
                O90.m5965c(uri10);
                C1414WT c1414wt8 = this.f10188f;
                C1414WT.m8764d(c1414wt8, uri10);
                if (!O90.m5963a(uri10.getScheme(), "file")) {
                    throw new IOException(F91.m2538u("Unsupported scheme for location '", uri10, "'."));
                }
                C0974PT c0974pt = new C0974PT(str5, str6, c1414wt8);
                C10585ox0 c10585ox0M8768h3 = C1414WT.m8768h(c1414wt8);
                if (c10585ox0M8768h3 != null) {
                    C10457nx0 c10457nx0M23579a = c10585ox0M8768h3.m23579a();
                    c10457nx0M23579a.f38624c.add(new C4136gl(3, c0974pt));
                    c10585ox0 = new C10585ox0(c10457nx0M23579a);
                } else {
                    c10585ox0 = null;
                }
                if (c10585ox0 == null) {
                    interfaceC11518wE03.mo8108f(new C6861t2(20));
                } else {
                    C6937uF c6937uF2 = new C6937uF(9, false);
                    if (str5 != null) {
                        c6937uF2.m25139k("Range", "bytes=" + str5 + "-");
                    }
                    if (downloadOptions2.getHeaders() != null) {
                        for (Map.Entry<String, String> entry2 : downloadOptions2.getHeaders().entrySet()) {
                            c6937uF2.m25139k(entry2.getKey(), entry2.getValue());
                        }
                    }
                    c6937uF2.m25136G(str7);
                    DN0 dn0M23580b2 = c10585ox0.m23580b(c6937uF2.m25141o());
                    c1414wt8.f13196e.put(str6, new C0597JT(uri10, dn0M23580b2));
                    AbstractC9366fP1.m18230b(c1414wt8.f13197f, null, new C0911OT(null, new C0534IT(downloadOptions2, dn0M23580b2, C1414WT.m8775t(uri10), str5 != null, interfaceC11518wE03), c1414wt8), 3);
                }
                return C8313Tf1.f11463a;
            case 10:
                Object[] objArr4 = (Object[]) obj;
                InterfaceC11518wE0 interfaceC11518wE04 = (InterfaceC11518wE0) obj2;
                O90.m5968f(objArr4, "<name for destructuring parameter 0>");
                O90.m5968f(interfaceC11518wE04, BaseJavaModule.METHOD_TYPE_PROMISE);
                String str8 = (String) objArr4[0];
                C1414WT c1414wt9 = this.f10188f;
                Activity activityM985a = c1414wt9.m25721b().m985a();
                if (activityM985a == null) {
                    throw new C6861t2(8);
                }
                if (c1414wt9.f13195d != null) {
                    throw new C6861t2(21);
                }
                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                if (Build.VERSION.SDK_INT >= 26 && str8 != null && (uri = Uri.parse(AbstractC1477XT.m9053a(str8))) != null) {
                    intent2.putExtra("android.provider.extra.INITIAL_URI", uri);
                }
                c1414wt9.f13195d = interfaceC11518wE04;
                activityM985a.startActivityForResult(intent2, 5394);
                return C8313Tf1.f11463a;
            case 11:
                Object[] objArr5 = (Object[]) obj;
                InterfaceC11518wE0 interfaceC11518wE05 = (InterfaceC11518wE0) obj2;
                O90.m5968f(objArr5, "<name for destructuring parameter 0>");
                O90.m5968f(interfaceC11518wE05, BaseJavaModule.METHOD_TYPE_PROMISE);
                Object obj20 = objArr5[0];
                Object obj21 = objArr5[1];
                FileSystemUploadOptions fileSystemUploadOptions2 = (FileSystemUploadOptions) objArr5[2];
                C10689pl0 c10689pl0 = C10689pl0.f40367d;
                C1414WT c1414wt10 = this.f10188f;
                C10777qR0 c10777qR0M8766f2 = C1414WT.m8766f(c1414wt10, (String) obj20, (String) obj21, fileSystemUploadOptions2, c10689pl0);
                C10585ox0 c10585ox0M8768h4 = C1414WT.m8768h(c1414wt10);
                C8313Tf1 c8313Tf12 = C8313Tf1.f11463a;
                if (c10585ox0M8768h4 != null) {
                    FirebasePerfOkHttpClient.enqueue(c10585ox0M8768h4.m23580b(c10777qR0M8766f2), new C1339VH(interfaceC11518wE05, c1414wt10, false, 11));
                    c8313Tf1 = c8313Tf12;
                } else {
                    c8313Tf1 = null;
                }
                if (c8313Tf1 == null) {
                    interfaceC11518wE05.mo8108f(new C6861t2(20));
                }
                return c8313Tf12;
            default:
                C7412Bx0 c7412Bx0 = (C7412Bx0) obj2;
                O90.m5968f((Activity) obj, "sender");
                O90.m5968f(c7412Bx0, "payload");
                if (c7412Bx0.f1098a == 5394) {
                    C1414WT c1414wt11 = this.f10188f;
                    if (c1414wt11.f13195d != null) {
                        Activity activityM985a2 = c1414wt11.m25721b().m985a();
                        if (activityM985a2 == null) {
                            throw new C6861t2(8);
                        }
                        Bundle bundle2 = new Bundle();
                        if (c7412Bx0.f1099b != -1 || (intent = c7412Bx0.f1100c) == null) {
                            bundle2.putBoolean("granted", false);
                        } else {
                            Uri data = intent.getData();
                            int flags = intent.getFlags() & 3;
                            if (data != null) {
                                activityM985a2.getContentResolver().takePersistableUriPermission(data, flags);
                            }
                            bundle2.putBoolean("granted", true);
                            bundle2.putString("directoryUri", String.valueOf(data));
                        }
                        InterfaceC11518wE0 interfaceC11518wE06 = c1414wt11.f13195d;
                        if (interfaceC11518wE06 != null) {
                            interfaceC11518wE06.resolve(bundle2);
                        }
                        c1414wt11.f13195d = null;
                    }
                }
                return C8313Tf1.f11463a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1099RT(C1414WT c1414wt, C11979zs0 c11979zs0) {
        super(2);
        this.f10187e = 11;
        this.f10188f = c1414wt;
    }
}
