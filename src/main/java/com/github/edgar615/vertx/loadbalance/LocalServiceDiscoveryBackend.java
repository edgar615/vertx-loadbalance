package com.github.edgar615.vertx.loadbalance;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.servicediscovery.Record;
import io.vertx.servicediscovery.spi.ServiceDiscoveryBackend;
import java.util.List;

public class LocalServiceDiscoveryBackend implements ServiceDiscoveryBackend {

  public void init(Vertx vertx, JsonObject config) {

  }

  public void store(Record record, Handler<AsyncResult<Record>> resultHandler) {

  }

  public void remove(Record record, Handler<AsyncResult<Record>> resultHandler) {

  }

  public void remove(String uuid, Handler<AsyncResult<Record>> resultHandler) {

  }

  public void update(Record record, Handler<AsyncResult<Void>> resultHandler) {

  }

  public void getRecords(Handler<AsyncResult<List<Record>>> resultHandler) {

  }

  public void getRecord(String uuid, Handler<AsyncResult<Record>> resultHandler) {

  }
}
