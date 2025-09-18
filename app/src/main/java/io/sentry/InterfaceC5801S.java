package io.sentry;

import io.sentry.internal.debugmeta.C6042c;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.Reader;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.S */
/* loaded from: classes2.dex */
public interface InterfaceC5801S {
    /* renamed from: a */
    String mo21457a(ConcurrentHashMap concurrentHashMap);

    /* renamed from: b */
    Object mo21458b(Reader reader, Class cls);

    /* renamed from: c */
    C6042c mo21459c(BufferedInputStream bufferedInputStream);

    /* renamed from: d */
    Object mo21460d(BufferedReader bufferedReader, Class cls, C6012e c6012e);

    /* renamed from: e */
    void mo21461e(Object obj, BufferedWriter bufferedWriter);

    /* renamed from: f */
    void mo21462f(C6042c c6042c, OutputStream outputStream);
}
