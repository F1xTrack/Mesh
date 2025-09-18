package com.p019vk.push.core.filedatastore;

import kotlin.Metadata;
import p000.InterfaceC1382Vy;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u0004\u0018\u00018\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m22267d2 = {"Lcom/vk/push/core/filedatastore/FileDataStore;", "T", "", "data", "", "write", "(Ljava/lang/Object;LVy;)Ljava/lang/Object;", "read", "(LVy;)Ljava/lang/Object;", "clear", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface FileDataStore<T> {
    Object clear(InterfaceC1382Vy interfaceC1382Vy);

    Object read(InterfaceC1382Vy interfaceC1382Vy);

    Object write(T t, InterfaceC1382Vy interfaceC1382Vy);
}
