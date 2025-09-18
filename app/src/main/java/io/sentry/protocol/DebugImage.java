package io.sentry.protocol;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class DebugImage implements InterfaceC6058l0 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.InterfaceC6058l0
    public void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) throws IOException {
        interfaceC5749A0.mo13824q();
        if (this.uuid != null) {
            interfaceC5749A0.mo13828u(CommonUrlParts.UUID).mo13811d(this.uuid);
        }
        if (this.type != null) {
            interfaceC5749A0.mo13828u("type").mo13811d(this.type);
        }
        if (this.debugId != null) {
            interfaceC5749A0.mo13828u("debug_id").mo13811d(this.debugId);
        }
        if (this.debugFile != null) {
            interfaceC5749A0.mo13828u("debug_file").mo13811d(this.debugFile);
        }
        if (this.codeId != null) {
            interfaceC5749A0.mo13828u("code_id").mo13811d(this.codeId);
        }
        if (this.codeFile != null) {
            interfaceC5749A0.mo13828u("code_file").mo13811d(this.codeFile);
        }
        if (this.imageAddr != null) {
            interfaceC5749A0.mo13828u("image_addr").mo13811d(this.imageAddr);
        }
        if (this.imageSize != null) {
            interfaceC5749A0.mo13828u("image_size").mo13820m(this.imageSize);
        }
        if (this.arch != null) {
            interfaceC5749A0.mo13828u("arch").mo13811d(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5749A0.mo13828u(str).mo13825r(iLogger, this.unknown.get(str));
            }
        }
        interfaceC5749A0.mo13817j();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(Long l) {
        this.imageSize = l;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(long j) {
        this.imageSize = Long.valueOf(j);
    }
}
