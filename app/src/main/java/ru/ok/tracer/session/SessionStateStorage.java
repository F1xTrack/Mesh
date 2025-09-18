package ru.ok.tracer.session;

import android.content.Context;
import defpackage.AbstractC7096sn0;
import defpackage.AbstractC7287tn0;
import defpackage.AbstractC7538v51;
import defpackage.AbstractC8069xu;
import defpackage.AbstractC8259yu;
import defpackage.MN;
import defpackage.O90;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import ru.ok.tracer.SystemState;
import ru.ok.tracer.session.SessionState;
import ru.ok.tracer.utils.SimpleFileKeyValueStorage;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b*\u0018\u0000 R2\u00020\u0001:\u0001RB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0014\u001a\u00020\u00062\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010'\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010!R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0011\u00101\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u00104\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00106\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b5\u00103R$\u0010<\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010A\u001a\u0004\u0018\u00010\u00102\b\u00107\u001a\u0004\u0018\u00010\u00108@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0013\u0010D\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\bB\u0010CR$\u0010I\u001a\u00020\t2\u0006\u00107\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010L\u001a\u00020\t2\u0006\u00107\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR\u0011\u0010N\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bM\u00100R\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020)0(8F¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lru/ok/tracer/session/SessionStateStorage;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LTf1;", "ensureLoaded", "()V", "Lru/ok/tracer/session/SessionState$Status;", "status", "", "isInBackground", "setCurrentSessionState", "(Lru/ok/tracer/session/SessionState$Status;Z)V", "", "", "properties", "setCustomProperties$tracer_commons_release", "(Ljava/util/Map;)V", "setCustomProperties", "consumePrevSessionStates", "Landroid/content/Context;", "Ljava/lang/Object;", "lock", "Ljava/lang/Object;", "Lru/ok/tracer/utils/SimpleFileKeyValueStorage;", "fileStorage", "Lru/ok/tracer/utils/SimpleFileKeyValueStorage;", "loaded", "Z", "", "currentStartTs", "J", "Lru/ok/tracer/SystemState;", "currSystemStateData", "Lru/ok/tracer/SystemState;", "prevStartTsData", "prevSystemStateData", "sessionStatesUploadTsData", "", "Lru/ok/tracer/session/SessionState;", "sessionStatesData", "Ljava/util/List;", "currentSessionStateData", "Lru/ok/tracer/session/SessionState;", "prevSessionStateData", "getPrevStartTs", "()J", "prevStartTs", "getPrevSystemState", "()Lru/ok/tracer/SystemState;", "prevSystemState", "getCurrentSystemState", "currentSystemState", "value", "isCurrentlyInBackground$tracer_commons_release", "()Z", "setCurrentlyInBackground$tracer_commons_release", "(Z)V", "isCurrentlyInBackground", "getUserId$tracer_commons_release", "()Ljava/lang/String;", "setUserId$tracer_commons_release", "(Ljava/lang/String;)V", SessionStateStorage.PROPERTY_KEY_USER_ID, "getPrevSessionState", "()Lru/ok/tracer/session/SessionState;", "prevSessionState", "getPrevSessionStatus", "()Lru/ok/tracer/session/SessionState$Status;", "setPrevSessionStatus", "(Lru/ok/tracer/session/SessionState$Status;)V", "prevSessionStatus", "getCurrentSessionStatus", "setCurrentSessionStatus", "currentSessionStatus", "getSessionStateUploadTs", "sessionStateUploadTs", "getPrevSessionStates", "()Ljava/util/List;", "prevSessionStates", "Companion", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionStateStorage {
    private static final int MAX_CUSTOM_PROPERTY_KEY_LENGTH = 32;
    private static final int MAX_CUSTOM_PROPERTY_VALUE_LENGTH = 64;
    private static final int MAX_SESSIONS = 50;
    private static final String PROPERTY_KEY_USER_ID = "userId";
    private static final String SESSION_START_TS = "session_start_ts";
    private static final String SESSION_STATES = "session_states";
    private static final String SESSION_STATE_UPLOAD_TS = "session_state_upload_ts";
    private static final String SESSION_SYSTEM_STATE = "session_system_state";
    private final Context context;
    private SystemState currSystemStateData;
    private volatile SessionState currentSessionStateData;
    private final long currentStartTs;
    private final SimpleFileKeyValueStorage fileStorage;
    private volatile boolean loaded;
    private final Object lock;
    private volatile SessionState prevSessionStateData;
    private long prevStartTsData;
    private SystemState prevSystemStateData;
    private List<SessionState> sessionStatesData;
    private long sessionStatesUploadTsData;

    public SessionStateStorage(Context context) {
        O90.f(context, "context");
        this.context = context;
        this.lock = new Object();
        this.fileStorage = new SimpleFileKeyValueStorage(new SessionStateStorage$fileStorage$1(this));
        this.currentStartTs = System.currentTimeMillis();
        this.prevStartTsData = Long.MIN_VALUE;
        this.sessionStatesUploadTsData = Long.MIN_VALUE;
        this.sessionStatesData = MN.a;
    }

    private final void ensureLoaded() {
        if (this.loaded) {
            return;
        }
        synchronized (this.lock) {
            try {
                if (!this.loaded) {
                    Long l = this.fileStorage.getLong(SESSION_START_TS);
                    this.prevStartTsData = l != null ? l.longValue() : Long.MIN_VALUE;
                    this.prevSystemStateData = SessionStateStorageKt.getSystemState(this.fileStorage, SESSION_SYSTEM_STATE);
                    SystemState systemStateCreateSystemState = SystemStateUtils.createSystemState(this.context);
                    SystemState systemState = this.prevSystemStateData;
                    this.currSystemStateData = SessionStateStorageKt.withPrevProperties(systemStateCreateSystemState, systemState != null ? systemState.getProperties() : null);
                    Long l2 = this.fileStorage.getLong(SESSION_STATE_UPLOAD_TS);
                    this.sessionStatesUploadTsData = l2 != null ? l2.longValue() : Long.MIN_VALUE;
                    List sessionStates = SessionStateStorageKt.getSessionStates(this.fileStorage, SESSION_STATES);
                    SessionState.Companion companion = SessionState.INSTANCE;
                    SystemState systemState2 = this.currSystemStateData;
                    if (systemState2 == null) {
                        O90.o("currSystemStateData");
                        throw null;
                    }
                    List<SessionState> listY = AbstractC8069xu.Y(MAX_SESSIONS, AbstractC8069xu.O(sessionStates, companion.invoke$tracer_commons_release(systemState2, SessionState.Status.BLANK)));
                    this.sessionStatesData = listY;
                    int size = listY.size();
                    this.currentSessionStateData = (SessionState) AbstractC8069xu.J(this.sessionStatesData);
                    this.prevSessionStateData = size > 1 ? this.sessionStatesData.get(size - 2) : null;
                    this.fileStorage.putLong(SESSION_START_TS, Long.valueOf(this.currentStartTs));
                    SimpleFileKeyValueStorage simpleFileKeyValueStorage = this.fileStorage;
                    SystemState systemState3 = this.currSystemStateData;
                    if (systemState3 == null) {
                        O90.o("currSystemStateData");
                        throw null;
                    }
                    SessionStateStorageKt.putSystemState(simpleFileKeyValueStorage, SESSION_SYSTEM_STATE, systemState3);
                    SessionStateStorageKt.putSessionStates(this.fileStorage, SESSION_STATES, this.sessionStatesData);
                    this.fileStorage.save();
                    this.loaded = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void setCurrentSessionState(SessionState.Status status, boolean isInBackground) {
        synchronized (this.lock) {
            ensureLoaded();
            SessionState sessionState = this.currentSessionStateData;
            if (sessionState == null) {
                O90.o("currentSessionStateData");
                throw null;
            }
            this.currentSessionStateData = sessionState.copy((15 & 1) != 0 ? sessionState.versionCode : 0L, (15 & 2) != 0 ? sessionState.versionName : null, (15 & 4) != 0 ? sessionState.sessionUuid : null, (15 & 8) != 0 ? sessionState.processName : null, (15 & 16) != 0 ? sessionState.status : status, (15 & 32) != 0 ? sessionState.isInBackground : isInBackground);
            List listX = AbstractC8069xu.x(1, this.sessionStatesData);
            SessionState sessionState2 = this.currentSessionStateData;
            if (sessionState2 == null) {
                O90.o("currentSessionStateData");
                throw null;
            }
            ArrayList arrayListO = AbstractC8069xu.O(listX, sessionState2);
            this.sessionStatesData = arrayListO;
            SessionStateStorageKt.putSessionStates(this.fileStorage, SESSION_STATES, arrayListO);
            this.fileStorage.save();
        }
    }

    public static /* synthetic */ void setCurrentSessionState$default(SessionStateStorage sessionStateStorage, SessionState.Status status, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            SessionState sessionState = sessionStateStorage.currentSessionStateData;
            if (sessionState == null) {
                O90.o("currentSessionStateData");
                throw null;
            }
            status = sessionState.getStatus();
        }
        if ((i & 2) != 0) {
            SessionState sessionState2 = sessionStateStorage.currentSessionStateData;
            if (sessionState2 == null) {
                O90.o("currentSessionStateData");
                throw null;
            }
            z = sessionState2.isInBackground();
        }
        sessionStateStorage.setCurrentSessionState(status, z);
    }

    public final void consumePrevSessionStates() {
        synchronized (this.lock) {
            ensureLoaded();
            this.sessionStatesUploadTsData = this.currentStartTs;
            this.sessionStatesData = AbstractC8259yu.e(AbstractC8069xu.J(this.sessionStatesData));
            this.fileStorage.putLong(SESSION_STATE_UPLOAD_TS, Long.valueOf(this.sessionStatesUploadTsData));
            SessionStateStorageKt.putSessionStates(this.fileStorage, SESSION_STATES, this.sessionStatesData);
            this.fileStorage.save();
        }
    }

    public final SessionState.Status getCurrentSessionStatus() {
        ensureLoaded();
        SessionState sessionState = this.currentSessionStateData;
        if (sessionState != null) {
            return sessionState.getStatus();
        }
        O90.o("currentSessionStateData");
        throw null;
    }

    public final SystemState getCurrentSystemState() {
        ensureLoaded();
        SystemState systemState = this.currSystemStateData;
        if (systemState != null) {
            return systemState.withCurrentDate$tracer_commons_release();
        }
        O90.o("currSystemStateData");
        throw null;
    }

    public final SessionState getPrevSessionState() {
        ensureLoaded();
        return this.prevSessionStateData;
    }

    public final List<SessionState> getPrevSessionStates() {
        ensureLoaded();
        return AbstractC8069xu.x(1, this.sessionStatesData);
    }

    public final SessionState.Status getPrevSessionStatus() {
        SessionState.Status status;
        SessionState prevSessionState = getPrevSessionState();
        return (prevSessionState == null || (status = prevSessionState.getStatus()) == null) ? SessionState.Status.BLANK : status;
    }

    public final long getPrevStartTs() {
        ensureLoaded();
        return this.prevStartTsData;
    }

    public final SystemState getPrevSystemState() {
        ensureLoaded();
        return this.prevSystemStateData;
    }

    public final long getSessionStateUploadTs() {
        ensureLoaded();
        return this.sessionStatesUploadTsData;
    }

    public final String getUserId$tracer_commons_release() {
        ensureLoaded();
        SystemState systemState = this.currSystemStateData;
        if (systemState != null) {
            return systemState.getProperties().get(PROPERTY_KEY_USER_ID);
        }
        O90.o("currSystemStateData");
        throw null;
    }

    public final boolean isCurrentlyInBackground$tracer_commons_release() {
        ensureLoaded();
        SystemState systemState = this.currSystemStateData;
        if (systemState != null) {
            return systemState.isInBackground();
        }
        O90.o("currSystemStateData");
        throw null;
    }

    public final void setCurrentSessionStatus(SessionState.Status status) {
        O90.f(status, "value");
        setCurrentSessionState$default(this, status, false, 2, null);
    }

    public final void setCurrentlyInBackground$tracer_commons_release(boolean z) throws Throwable {
        SystemState systemState;
        synchronized (this.lock) {
            try {
                ensureLoaded();
                systemState = this.currSystemStateData;
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (systemState == null) {
                    O90.o("currSystemStateData");
                    throw null;
                }
                if (systemState.isInBackground() == z) {
                    return;
                }
                SystemState systemState2 = this.currSystemStateData;
                if (systemState2 == null) {
                    O90.o("currSystemStateData");
                    throw null;
                }
                SystemState systemStateCopy$default = SystemState.copy$default(systemState2, null, 0L, null, null, null, null, null, null, null, z, false, null, null, 7679, null);
                this.currSystemStateData = systemStateCopy$default;
                SimpleFileKeyValueStorage simpleFileKeyValueStorage = this.fileStorage;
                if (systemStateCopy$default == null) {
                    O90.o("currSystemStateData");
                    throw null;
                }
                SessionStateStorageKt.putSystemState(simpleFileKeyValueStorage, SESSION_SYSTEM_STATE, systemStateCopy$default);
                setCurrentSessionState$default(this, null, z, 1, null);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final void setCustomProperties$tracer_commons_release(Map<String, String> properties) {
        O90.f(properties, "properties");
        synchronized (this.lock) {
            try {
                ensureLoaded();
                SystemState systemState = this.currSystemStateData;
                if (systemState == null) {
                    O90.o("currSystemStateData");
                    throw null;
                }
                LinkedHashMap linkedHashMapQ = AbstractC7096sn0.q(systemState.getProperties());
                boolean zUpdate = false;
                for (Map.Entry<String, String> entry : properties.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    zUpdate = SessionStateStorageKt.update(linkedHashMapQ, AbstractC7538v51.X(32, key), value != null ? AbstractC7538v51.X(64, value) : null);
                }
                if (zUpdate) {
                    SystemState systemState2 = this.currSystemStateData;
                    if (systemState2 == null) {
                        O90.o("currSystemStateData");
                        throw null;
                    }
                    SystemState systemStateCopy$default = SystemState.copy$default(systemState2, null, 0L, null, null, null, null, null, null, null, false, false, linkedHashMapQ, null, 6143, null);
                    this.currSystemStateData = systemStateCopy$default;
                    SimpleFileKeyValueStorage simpleFileKeyValueStorage = this.fileStorage;
                    if (systemStateCopy$default == null) {
                        O90.o("currSystemStateData");
                        throw null;
                    }
                    SessionStateStorageKt.putSystemState(simpleFileKeyValueStorage, SESSION_SYSTEM_STATE, systemStateCopy$default);
                    this.fileStorage.save();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setPrevSessionStatus(SessionState.Status status) {
        O90.f(status, "value");
        ensureLoaded();
        SessionState sessionState = this.prevSessionStateData;
        if (sessionState != null) {
            synchronized (this.lock) {
                ensureLoaded();
                SessionState sessionStateCopy = sessionState.copy((15 & 1) != 0 ? sessionState.versionCode : 0L, (15 & 2) != 0 ? sessionState.versionName : null, (15 & 4) != 0 ? sessionState.sessionUuid : null, (15 & 8) != 0 ? sessionState.processName : null, (15 & 16) != 0 ? sessionState.status : status, (15 & 32) != 0 ? sessionState.isInBackground : false);
                this.prevSessionStateData = sessionStateCopy;
                if (this.sessionStatesData.size() <= 1) {
                    return;
                }
                ArrayList arrayListO = AbstractC8069xu.O(AbstractC8069xu.O(AbstractC8069xu.x(2, this.sessionStatesData), sessionStateCopy), AbstractC8069xu.J(this.sessionStatesData));
                this.sessionStatesData = arrayListO;
                SessionStateStorageKt.putSessionStates(this.fileStorage, SESSION_STATES, arrayListO);
                this.fileStorage.save();
            }
        }
    }

    public final void setUserId$tracer_commons_release(String str) {
        setCustomProperties$tracer_commons_release(AbstractC7287tn0.c(new Pair(PROPERTY_KEY_USER_ID, str)));
    }
}
