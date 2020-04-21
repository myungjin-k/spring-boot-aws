package com.myungjin.springboot.service.posts;

import com.myungjin.springboot.domain.posts.Posts;
import com.myungjin.springboot.domain.posts.PostsRepository;
import com.myungjin.springboot.web.dto.PostsListResponseDto;
import com.myungjin.springboot.web.dto.PostsSaveRequestDto;
import com.myungjin.springboot.web.dto.PostsUpdateRequestDto;
import com.myungjin.springboot.web.dto.PostsUpdateResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto){
        Posts posts = postsRepository.findById(id).orElseThrow(()
            -> new IllegalArgumentException("해당 게시물이 없습니다. id="+id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }
    @Transactional
    public PostsUpdateResponseDto findById(Long id){
        Posts entity = postsRepository.findById(id).orElseThrow(()
                -> new IllegalArgumentException("해당 게시물이 없습니다. id="+id));

        return new PostsUpdateResponseDto(entity);
    }

    @Transactional
    public List<PostsListResponseDto> findAllDesc(){
        return postsRepository.findAllDesc().stream()
                .map(PostsListResponseDto::new)
                .collect(Collectors.toList());
    }
    @Transactional
    public void delete(Long id){
        Posts post = postsRepository.findById(id).orElseThrow(()
                -> new IllegalArgumentException("해당 게시물이 없습니다. id="+id));
        postsRepository.delete(post);
    }
}
