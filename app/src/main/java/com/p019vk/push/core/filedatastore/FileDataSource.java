package com.p019vk.push.core.filedatastore;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC0705LB;
import p000.AbstractC11432vY1;
import p000.C0399GK;
import p000.C4090g1;
import p000.ExecutorC1023QF;
import p000.F71;
import p000.InterfaceC0754Lz;
import p000.O90;

@Metadata(m22266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\u000e\u001a\u00020\u0004H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, m22267d2 = {"Lcom/vk/push/core/filedatastore/FileDataSource;", "", "Landroid/content/Context;", "context", "", "fileName", "LLz;", "scope", "<init>", "(Landroid/content/Context;Ljava/lang/String;LLz;)V", "LPS0;", "getData-IoAF18A", "(LVy;)Ljava/lang/Object;", "getData", "data", "LTf1;", "setData-gIAlu-s", "(Ljava/lang/String;LVy;)Ljava/lang/Object;", "setData", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class FileDataSource {

    @Deprecated
    public static final String FILE_DATASOURCE_DIR = "vkpns";

    /* renamed from: a */
    public final Context f20409a;

    /* renamed from: b */
    public final String f20410b;

    /* renamed from: c */
    public final InterfaceC0754Lz f20411c;

    /* renamed from: d */
    public final F71 f20412d;

    public FileDataSource(Context context, String str, InterfaceC0754Lz interfaceC0754Lz) {
        O90.m5968f(context, "context");
        O90.m5968f(str, "fileName");
        O90.m5968f(interfaceC0754Lz, "scope");
        this.f20409a = context;
        this.f20410b = str;
        this.f20411c = interfaceC0754Lz;
        this.f20412d = AbstractC0705LB.m4915b(new C4090g1(19, this));
    }

    /* renamed from: a */
    public static void m13740a(File file) throws IOException {
        if (file.canRead() && file.canWrite()) {
            return;
        }
        throw new IOException("Can't access " + file.getPath());
    }

    public static final File access$getFileSource(FileDataSource fileDataSource) {
        return (File) fileDataSource.f20412d.getValue();
    }

    public static final File access$getOrCreateFile(FileDataSource fileDataSource) throws IOException {
        File file = new File(fileDataSource.f20409a.getFilesDir().getPath() + "/vkpns");
        if ((!file.exists() || !file.isDirectory()) && !file.mkdir()) {
            throw new IOException("Can't create vkpns dir");
        }
        m13740a(file);
        File file2 = new File(file.getPath() + '/' + fileDataSource.f20410b);
        if (file2.exists() && file2.isFile()) {
            m13740a(file2);
        } else {
            boolean zCreateNewFile = file2.createNewFile();
            String str = "Can't create " + file2.getPath() + " file";
            if (!zCreateNewFile) {
                throw new IOException(str);
            }
            m13740a(file2);
        }
        return file2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /* renamed from: getData-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26671getDataIoAF18A(p000.InterfaceC1382Vy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p000.C6619pT
            if (r0 == 0) goto L13
            r0 = r6
            pT r0 = (p000.C6619pT) r0
            int r1 = r0.f40092c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40092c = r1
            goto L18
        L13:
            pT r0 = new pT
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f40090a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f40092c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p000.RQ1.m7017d(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            p000.RQ1.m7017d(r6)
            Lz r6 = r5.f20411c
            Bz r6 = r6.mo2469b()
            qT r2 = new qT
            r4 = 0
            r2.<init>(r5, r4)
            r0.f40092c = r3
            java.lang.Object r6 = p000.AbstractC9366fP1.m18233e(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            PS0 r6 = (p000.PS0) r6
            java.lang.Object r6 = r6.f9075a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.filedatastore.FileDataSource.m26671getDataIoAF18A(Vy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /* renamed from: setData-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26672setDatagIAlus(java.lang.String r6, p000.InterfaceC1382Vy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p000.C6745rT
            if (r0 == 0) goto L13
            r0 = r7
            rT r0 = (p000.C6745rT) r0
            int r1 = r0.f41671c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41671c = r1
            goto L18
        L13:
            rT r0 = new rT
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f41669a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f41671c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p000.RQ1.m7017d(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            p000.RQ1.m7017d(r7)
            Lz r7 = r5.f20411c
            Bz r7 = r7.mo2469b()
            sT r2 = new sT
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f41671c = r3
            java.lang.Object r7 = p000.AbstractC9366fP1.m18233e(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            PS0 r7 = (p000.PS0) r7
            java.lang.Object r6 = r7.f9075a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.filedatastore.FileDataSource.m26672setDatagIAlus(java.lang.String, Vy):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FileDataSource(Context context, String str, InterfaceC0754Lz interfaceC0754Lz, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            C0399GK c0399gk = C0399GK.f3694a;
            interfaceC0754Lz = AbstractC11432vY1.m25444a(ExecutorC1023QF.f9548c);
        }
        this(context, str, interfaceC0754Lz);
    }
}
