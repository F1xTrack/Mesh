package com.p019vk.push.core.data.repository;

import android.content.Context;
import com.p019vk.push.core.filedatastore.FileDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.O90;

@Metadata(m22266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m22267d2 = {"Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;", "", "Landroid/content/Context;", "context", "Lcom/vk/push/core/filedatastore/FileDataSource;", "fileDataSource", "<init>", "(Landroid/content/Context;Lcom/vk/push/core/filedatastore/FileDataSource;)V", "", "", "issueKeys", "LTf1;", "setBlackList", "(Ljava/util/List;LVy;)Ljava/lang/Object;", "getBlackList", "(LVy;)Ljava/lang/Object;", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class IssueKeyBlackListRepository {

    @Deprecated
    public static final String FILE_NAME = "issue_keys_black_list.txt";

    /* renamed from: a */
    public final FileDataSource f20349a;

    public IssueKeyBlackListRepository(Context context, FileDataSource fileDataSource) {
        O90.m5968f(context, "context");
        O90.m5968f(fileDataSource, "fileDataSource");
        this.f20349a = fileDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getBlackList(p000.InterfaceC1382Vy r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p000.C9771ia0
            if (r0 == 0) goto L13
            r0 = r5
            ia0 r0 = (p000.C9771ia0) r0
            int r1 = r0.f29328c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29328c = r1
            goto L18
        L13:
            ia0 r0 = new ia0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f29326a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f29328c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            p000.RQ1.m7017d(r5)
            PS0 r5 = (p000.PS0) r5
            java.lang.Object r5 = r5.f9075a
            goto L41
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            p000.RQ1.m7017d(r5)
            r0.f29328c = r3
            com.vk.push.core.filedatastore.FileDataSource r5 = r4.f20349a
            java.lang.Object r5 = r5.m26671getDataIoAF18A(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            boolean r0 = r5 instanceof p000.OS0
            if (r0 == 0) goto L46
            r5 = 0
        L46:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L57
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = 6
            r2 = 0
            java.util.List r5 = p000.AbstractC11374v51.m25340O(r5, r0, r2, r1)
            goto L59
        L57:
            MN r5 = p000.C0779MN.f7117a
        L59:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.data.repository.IssueKeyBlackListRepository.getBlackList(Vy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object setBlackList(java.util.List<java.lang.String> r11, p000.InterfaceC1382Vy r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof p000.C9899ja0
            if (r0 == 0) goto L13
            r0 = r12
            ja0 r0 = (p000.C9899ja0) r0
            int r1 = r0.f35250c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35250c = r1
            goto L18
        L13:
            ja0 r0 = new ja0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f35248a
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f35250c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            p000.RQ1.m7017d(r12)
            PS0 r12 = (p000.PS0) r12
            r12.getClass()
            goto L50
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            p000.RQ1.m7017d(r12)
            r4 = r11
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r7 = 0
            r8 = 0
            java.lang.String r5 = ","
            r6 = 0
            r9 = 62
            java.lang.String r11 = p000.AbstractC7167xu.m25962H(r4, r5, r6, r7, r8, r9)
            r0.f35250c = r3
            com.vk.push.core.filedatastore.FileDataSource r12 = r10.f20349a
            java.lang.Object r11 = r12.m26672setDatagIAlus(r11, r0)
            if (r11 != r1) goto L50
            return r1
        L50:
            Tf1 r11 = p000.C8313Tf1.f11463a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.data.repository.IssueKeyBlackListRepository.setBlackList(java.util.List, Vy):java.lang.Object");
    }

    public /* synthetic */ IssueKeyBlackListRepository(Context context, FileDataSource fileDataSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new FileDataSource(context, FILE_NAME, null, 4, null) : fileDataSource);
    }
}
