
CREATE TABLE default.vklikes (
  ownerId Int64,
  itemId Int64,
  postId Int64,
  itemType String,
  ctime Int64
) ENGINE = Memory();

INSERT INTO default.vklikes  values (1,2,'post',5);

select * from default.vklikes;