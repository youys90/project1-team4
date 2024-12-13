
package infra.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import infra.dto.RoomDto;
import infra.service.RoomService;
import lombok.RequiredArgsConstructor;

/**
 * API
 * - 룸 전체조회
 * - 룸 상세조회
 */
@RequiredArgsConstructor
@RequestMapping("/room")
@RestController
public class RoomController {
	
	private final RoomService roomService;
	
	
	
	@PutMapping("/{rid}")
	public ResponseEntity<String> updateRoom(@PathVariable Long rid, @RequestBody RoomDto roomDto) {
	    // 서비스를 통해 데이터를 수정
	    ResponseEntity<String> response = roomService.updateRoom(rid, roomDto);

	    // 이미 ResponseEntity로 처리되므로 추가적인 로직을 직접 처리할 필요 없음
	    return response;
	}
	

}
